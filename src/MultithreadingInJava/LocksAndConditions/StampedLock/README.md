So in Stamped Lock we have both capabilities 

1. Read/Write Lock capability
2. Optimistic Read Also

There are two types of locks 
1. Optimistic Locks {No Locks required}
2. Pessimistic Locks {synchronised, reentrant, read/write}


****
In Pessimistic approaches other threads are asked to wait until one thread comes out.

****
**In optimistic Read Locking :**

If two threads are trying to access the critical section or row in a table then it has version associated with it and 
after both of them reading the version of record, when one thread updates the value and updates the version as well 
so other one trying to update sees updated version it rollback the changes and re reads the value and performs actions.

