
de.uplanet.lucy.server.security.IxAccessController.checkPermission(new java.security.AllPermission())

def mbean = g_springApplicationContext.getBean("loggingMx")
assert mbean

mbean.disableDumpRequest()

g_syslog.info("\n--STOP-------------------------------------------RequestDump-UPSUPPORT-JMXPROZESS------------------------------------------STOP--\n")
