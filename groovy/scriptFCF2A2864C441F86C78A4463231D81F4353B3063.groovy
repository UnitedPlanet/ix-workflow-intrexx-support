de.uplanet.lucy.server.security.IxAccessController.checkPermission(new java.security.AllPermission())

def mbean = g_springApplicationContext.getBean("loggingMx")
assert mbean

mbean.loginDebug = false
g_syslog.info("\n--STOP-------------------------------------------Login Intrexx Support Prozess------------------------------------------STOP--\n")
