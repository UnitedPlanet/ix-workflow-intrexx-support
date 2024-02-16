g_syslog.info("\n--START------------------------------------------RequestDump Intrexx Support Prozess-----------------------------------------START--\n")

de.uplanet.lucy.server.security.IxAccessController.checkPermission(new java.security.AllPermission())

de.uplanet.lucy.server.support.scripting.groovy.GroovySupportHelper.getLogging().enableDumpRequest()
