
package observer;

public class Demo {

    public static void main(String[] args) {
        // create subject
        MySubject topic = new MySubject();

        // create observers
        Observer observer1 = new MySubjectSubscriber("observer1");
        Observer observer2 = new MySubjectSubscriber("observer2");
        Observer observer3 = new MySubjectSubscriber("observer3");

        // register observers to the subject
        topic.register(observer1);
        topic.register(observer2);
        topic.register(observer3);

        // attach observer to subject
        observer1.setSubject(topic);
        observer2.setSubject(topic);
        observer3.setSubject(topic);

        // check if any update is available
        observer1.update();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // now send message to subject
        topic.postMessage("New Message");
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // now send message to subject
        topic.postMessage(null);
    }

}
