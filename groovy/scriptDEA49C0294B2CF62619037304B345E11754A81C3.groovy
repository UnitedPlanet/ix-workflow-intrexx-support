g_syslog.info("\n--START----------------------------------------ThreadStacks Intrexx Support Prozess-----------------------------------------START--\n")

de.uplanet.lucy.server.security.IxAccessController.checkPermission(new java.security.AllPermission())

de.uplanet.lucy.server.support.scripting.groovy.GroovySupportHelper.getLogging().logThreadStacks()

g_syslog.info("\n--STOP----------------------------------------ThreadStacks Intrexx Support Prozess------------------------------------------STOP--\n")
