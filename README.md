# Forge

A software forge in Docker with the following components:

- JIRA
- Confluence
- Bitbucket
- Nexus
- Jenkins

There is no db support right now.

## Configuration

Copy the `setenv.sh.sample` to `setenv.sh` and put
sensible values for each variable.

Source the file inside your environment so the environments variables are set:

    source ./setenv.sh

You can also customize the `settings.yml` file directly, it reads the values of the environment variables.

## Usage

### Start the forge after it has been initialized

To start the forge:

    docker-compose start.yml

For instance after a shutdown of the docker system.
It didn't erase any volume so if the images have not changed (latest is pulled)
everything should start again.

### Access the forge

Go to `http://${docker_host_ip}/` to access the forge and the various services.

There is manual configuration to do in most of the services, especially Atlassian ones, but it should work.

## Roadmap

Further automate the Atlassian products installation.

## References

### JIRA Automated installation

- [Fully automated installation/configuration of JIRA](https://community.atlassian.com/t5/Jira-questions/Fully-automated-installation-configuration-of-JIRA/qaq-p/147413)
- [Unattended installation - Atlassian Documentation](https://confluence.atlassian.com/adminjiraserver071/unattended-installation-855475683.html?_ga=2.198760681.797625152.1542718714-1657682247.1524073517)
