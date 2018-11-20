#!groovy
import java.util.logging.Level
import java.util.logging.Logger
import hudson.security.*
import jenkins.model.*

def instance = Jenkins.getInstance()
def logger = Logger.getLogger(Jenkins.class.getName())

logger.log(Level.INFO, "Ensuring that local user 'forge_admin' is created.")

if (!instance.isUseSecurity()) {
    logger.log(Level.INFO, "Creating local admin user 'forge_admin'.")

    def strategy = new FullControlOnceLoggedInAuthorizationStrategy()
    strategy.setAllowAnonymousRead(false)

    def hudsonRealm = new HudsonPrivateSecurityRealm(false)
    hudsonRealm.createAccount("forge_admin", "mdp4forge")

    instance.setSecurityRealm(hudsonRealm)
    instance.setAuthorizationStrategy(strategy)
    instance.save()
}