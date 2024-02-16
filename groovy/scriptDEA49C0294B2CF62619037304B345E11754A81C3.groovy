g_syslog.info("\n--START----------------------------------------ThreadStacks-UPSUPPORT-JMXPROZESS-----------------------------------------START--\n")
de.uplanet.lucy.server.security.IxAccessController.checkPermission(new java.security.AllPermission())

def mbean = g_springApplicationContext.getBean("loggingMx")
assert mbean

mbean.logThreadStacks()
g_syslog.info("\n--STOP----------------------------------------ThreadStacks-UPSUPPORT-JMXPROZESS------------------------------------------STOP--\n")
