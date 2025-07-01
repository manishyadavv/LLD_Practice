So in Read Write Lock 
Only 1 thread can acquire the writeLock but multiple can acquire read lock


Similar to shared and exclusive lock

if some thread has acquired the read lock than another thread can acquire the read lock but cannot acquire the write lock

if someone has write lock no on can acquire either of lock

read is similar to saying shared lock and write is saying exclusive lock