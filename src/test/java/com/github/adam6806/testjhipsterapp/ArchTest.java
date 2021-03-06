package com.github.adam6806.testjhipsterapp;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

class ArchTest {

    @Test
    void servicesAndRepositoriesShouldNotDependOnWebLayer() {
        JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("com.github.adam6806.testjhipsterapp");

        noClasses()
            .that()
            .resideInAnyPackage("com.github.adam6806.testjhipsterapp.service..")
            .or()
            .resideInAnyPackage("com.github.adam6806.testjhipsterapp.repository..")
            .should()
            .dependOnClassesThat()
            .resideInAnyPackage("..com.github.adam6806.testjhipsterapp.web..")
            .because("Services and repositories should not depend on web layer")
            .check(importedClasses);
    }
}
