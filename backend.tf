
terraform
  backend "s3" {
    bucket = "devterraformaiza.com"
    region = "us-east-1"
    key    = "dev"
}
