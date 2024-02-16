g_syslog.info("\n--START-------------------------------------------JDBCTrace-UPSUPPORT-JMXPROZESS------------------------------------------START--\n")


de.uplanet.lucy.server.security.IxAccessController.checkPermission(new java.security.AllPermission())

def mbean1 = g_springApplicationContext.getBean("loggingMx")
assert mbean1

mbean1.enableJdbcTrace()


// def mbean2 = g_springApplicationContext.getBean("WebConnectorMx")
// assert mbean2

// mbean2.LogRequestStartEnd = true;
