Till now we have studied that locking the critical section is dependent upon object using synchronised
like two threads were calling shared section using same object of sharedResource we were able to maintain synchronization
using synchronized and monitor locks but now we wont be able to do it because there can be mulitple objects created of
shared resource using differernt clases how to handle these cases now to resolve this , insteading of putting lock on objects  
we are putting locks on section itself.
Four Locks

*1. REENTRANT LOCK* 

*2. READ WRITE LOCK*

*3. SEMAPHORE*

*4. STAMPED*