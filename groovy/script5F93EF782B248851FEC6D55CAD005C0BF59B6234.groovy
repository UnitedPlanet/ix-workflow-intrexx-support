g_syslog.info("\n--START------------------------------------------Login-Debug-UPSUPPORT-JMXPROZESS-----------------------------------------START--\n")
de.uplanet.lucy.server.security.IxAccessController.checkPermission(new java.security.AllPermission())

def mbean = g_springApplicationContext.getBean("loggingMx")
assert mbean

mbean.loginDebug = true

