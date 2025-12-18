def call(String projectName, String imageTag = 'latest', String dockerHubUser){
    echo "Building Docker image: ${dockerHubUser}/${projectName}:${imageTag}"
    sh "docker build -t ${dockerHubUser}/${projectName}:${imageTag} ."
}
