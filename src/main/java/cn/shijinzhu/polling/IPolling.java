package cn.shijinzhu.polling;

/**
 * IPolling <br/>
 * Created by shijinzhu on 2018.
 */
interface IPolling {

    /**
     * 添加一个轮训任务
     *
     * @param name name
     * @param task task
     */
    void addTask(String name, PollingTask task);

    /**
     * 活一个轮训任务
     *
     * @param name name
     * @return PollingTask
     */
    PollingTask getTask(String name);

    /**
     * 删除一个轮训任务
     *
     * @param name name
     * @return boolean
     */
    boolean removeTask(String name);

    /**
     * 删除所有的轮训任务
     */
    void removeAllTask();
}