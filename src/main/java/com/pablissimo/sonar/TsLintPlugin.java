package com.pablissimo.sonar;

import java.util.Arrays;
import java.util.List;

import org.sonar.api.Properties;
import org.sonar.api.Property;
import org.sonar.api.SonarPlugin;

@Properties({
	  @Property(
	    key = "sonar.ts.tslintpath",
	    defaultValue = "",
	    name = "Path to TSLint",
	    description = "Path to installed Node TSLint",
	    project = false, 
	    global = true
	  )
	})
public class TsLintPlugin extends SonarPlugin {
	public List getExtensions() {
		return Arrays.asList
				(
					TypeScriptRuleProfile.class,
					TypeScriptLanguage.class, 
				    TsLintSensor.class, 
					TsRulesDefinition.class
				);
	}
}
