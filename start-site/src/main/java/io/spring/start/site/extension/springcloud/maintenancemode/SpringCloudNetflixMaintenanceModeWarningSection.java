/*
 * Copyright 2019-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.spring.start.site.extension.springcloud.maintenancemode;

import java.util.Set;

import io.spring.initializr.generator.io.template.TemplateRenderer;
import io.spring.initializr.generator.io.text.BulletedSection;
import io.spring.initializr.generator.io.text.Section;
import io.spring.initializr.generator.spring.documentation.PreDefinedSection;
import io.spring.initializr.metadata.Dependency;

/**
 * A {@link Section} that provides information about Spring Cloud Netflix maintenance
 * mode dependencies requested by the user.
 *
 * @author Olga Maciaszek-Sharma
 */
class SpringCloudNetflixMaintenanceModeWarningSection extends PreDefinedSection {

	private static final String WARNING_MAINTENANCE_MODE = "Warning - Maintenance Mode";

	private static final String TEMPLATE_NAME = "spring-cloud-netflix-maintenance-mode-dependencies";

	SpringCloudNetflixMaintenanceModeWarningSection(
			Set<Dependency> maintenanceModeDependencies,
			TemplateRenderer templateRenderer) {
		super(WARNING_MAINTENANCE_MODE);
		BulletedSection<Dependency> dependencies = new BulletedSection<>(templateRenderer,
				TEMPLATE_NAME);
		maintenanceModeDependencies.forEach(dependencies::addItem);
		addSection(dependencies);
	}

}
