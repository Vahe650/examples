package tread;

class NewThread implements Runnable {
    Thread t;
    	NewThread() {
    		t = new Thread(this, "Demo Thread");
    		t.start();
    	}
    	public void run() {
    		try {
    			for(int i = 3; i > 0; i--) {
    				System.out.println("Дочерний поток: " + i);
    				Thread.sleep(1000);


    			}
    		} catch (InterruptedException e) {
    			System.out.println("Дочерний поток прерван.");
    		}
    		System.out.println("Выход из дочернего потока.");
    	}
    }
    class ThreadDemo {
    	public static void main(String args[]) {
    		new NewThread();
    		try {
    			for(int i = 3; i > 0; i--) {
    				System.out.println("Главный поток: " + i);
    				Thread.sleep(1000);
    			}
    		} catch (InterruptedException e) {
    		}
    		System.out.println("Выход из главного потока.");
    	}
    }