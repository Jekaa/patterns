package ru.patterns.creational.object_pool;

public class ExportingProcess {

    private final long processNo;

    public ExportingProcess(long processNo) {
        this.processNo = processNo;
        // do some  expensive calls / tasks here in future
        System.out.println("Object with process no. " + processNo + " was created");
    }

    public long getProcessNo() {
        return processNo;
    }
}
