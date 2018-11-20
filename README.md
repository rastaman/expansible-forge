# Forge

A software forge in Docker with the following components:

- JIRA
- Confluence
- Bitbucket
- Crowd
- Nexus
- Jenkins

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
