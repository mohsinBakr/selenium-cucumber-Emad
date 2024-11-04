pipeline {
    agent any
    parameters {
        string(name: 'FEATURE_FILES', defaultValue: 'NopCom_SearchForProduct.feature', description: 'Comma-separated list of feature files to run')
    }
    stages {
        stage('Run Tests') {
            steps {
                script {
                    // Define the base path for the feature files
                    def basePath = 'src/test/resources/features/'

                    // Construct the full paths for each specified feature file
                    def featuresList = FEATURE_FILES.split(',').collect { filename ->
                        "${basePath}${filename.trim()}"
                    }.join(' ')

                    // Log the constructed feature paths for debugging
                    echo "Running features: ${featuresList}"

                    // Run the Cucumber tests with the specified feature files
                    sh "mvn clean test -Dcucumber.options='${featuresList}'"
                }
            }
        }
    }
}
