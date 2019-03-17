node {
    properties([pipelineTriggers([pollSCM('H * * * * ')])])
    stage ("Terraform init"){
        sh "terraform init"
    }
    stage ("Terraform plan"){
        sh ("terraform plan")
    }
}
