g_syslog.info("\n--START--------------------------------------------RUN-GC Intrexx Support Prozess-------------------------------------------START--\n")
System.gc()
System.runFinalization()
g_syslog.info("\n--STOP---------------------------------------------RUN-GC Intrexx Support Prozess--------------------------------------------STOP--\n")
