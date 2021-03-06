package com.dianping.puma.syncserver.job.executor.failhandler;

import org.apache.commons.collections.buffer.CircularFifoBuffer;

import com.dianping.puma.core.event.ChangedEvent;
import com.dianping.puma.core.sync.model.task.Task;
import com.dianping.puma.syncserver.job.executor.AbstractTaskExecutor;
import com.dianping.puma.syncserver.mysql.MysqlExecutor;

@SuppressWarnings("rawtypes")
public class HandleContext {
    private ChangedEvent         changedEvent;

    private Exception            exception;

    private MysqlExecutor        mysqlExecutor;

    private Task                 task;

    private AbstractTaskExecutor executor;

    private CircularFifoBuffer   lastEvents;

    public ChangedEvent getChangedEvent() {
        return changedEvent;
    }

    public void setChangedEvent(ChangedEvent changedEvent) {
        this.changedEvent = changedEvent;
    }

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }

    public MysqlExecutor getMysqlExecutor() {
        return mysqlExecutor;
    }

    public void setMysqlExecutor(MysqlExecutor mysqlExecutor) {
        this.mysqlExecutor = mysqlExecutor;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public AbstractTaskExecutor getExecutor() {
        return executor;
    }

    public void setExecutor(AbstractTaskExecutor executor) {
        this.executor = executor;
    }

    public CircularFifoBuffer getLastEvents() {
        return lastEvents;
    }

    public void setLastEvents(CircularFifoBuffer lastEvents) {
        this.lastEvents = lastEvents;
    }

}
