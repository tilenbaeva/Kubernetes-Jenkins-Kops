# Kubernetes-Jenkins-Kops

# This file repository includes files that has been created my KOPS to create kubernetes cluster that will be triggered by Terraform and deployed by Jenkins. 


We will  create 3 VM in AWS, Google console (anywhere) with  Jenkins on it. This 3 Vm machines will be used as a slaves nodes for Jenkins to spread workload. 
Log in into Jenkins Workers = ssh to worker b=node
1. ssh ec2-user@IP
2. sudo su -
3. vim /etc/ssh/sshd_config
search for /PermitRootLogin     Yes
           /PasswordAuthentication   Yes
vim  ~/.ssh/authorized_keys
remove until ssh-rsa
systemctl restart sshd
passwd (change the password to login next time with passwd, not ec-user)

