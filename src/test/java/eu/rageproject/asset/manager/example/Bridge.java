package eu.rageproject.asset.manager.example;

import eu.rageproject.asset.manager.IBridge;
import eu.rageproject.asset.manager.ILog;
import eu.rageproject.asset.manager.Severity;

public class Bridge implements IBridge, ILog
{
    public void Log(Severity severity, String msg) {
        System.out.println(severity.toString()+ " - " +msg);
    }
}