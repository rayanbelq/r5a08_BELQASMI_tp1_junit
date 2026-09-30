BELQASMI Rayan Guido

## Observez les dépendances qui se trouvent dans le fichier build.gradle, à quoi correspondent-elles ?

org.junit.jupiter:junit-jupiter-api:5.8.2 (testImplementation) : Il s'agit de l'API de JUnit 5. C'est ce qui permet d'écrire le code des tests. Elle fournit toutes les annotations de base (comme @Test, @BeforeEach, @Disabled) et les méthodes pour structurer les classes de tests. 

org.junit.jupiter:junit-jupiter-engine:5.8.2 (testRuntimeOnly) : Il s'agit du moteur d'exécution de JUnit 5. Alors que l'API sert à écrire les tests, le moteur sert à les faire tourner en arrière-plan. 

org.assertj:assertj-core:3.22.0 (testImplementation) : Il s'agit de AssertJ.

  ** Le mot-clé testImplementation signifie que cette bibliothèque est requise compiler les tests.
  
  ** Le mot-clé testRuntimeOnly indique qu'il n'est pas nécessaire pendant l'écriture du code (compilation), mais qu'il est indispensable au moment de l'exécution (lorsque qu'on lance les tests).
