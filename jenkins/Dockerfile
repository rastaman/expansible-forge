FROM jenkins/jenkins

COPY conf/executors.groovy /usr/share/jenkins/ref/init.groovy.d/executors.groovy
COPY conf/security.groovy /usr/share/jenkins/ref/init.groovy.d/security.groovy
COPY conf/plugins.txt /usr/share/jenkins/ref/plugins.txt
COPY conf/jenkins.model.JenkinsLocationConfiguration.xml /usr/share/jenkins/ref/jenkins.model.JenkinsLocationConfiguration.xml

RUN /usr/local/bin/install-plugins.sh < /usr/share/jenkins/ref/plugins.txt
RUN echo 2.0 > /usr/share/jenkins/ref/jenkins.install.UpgradeWizard.state


