# RiHAV
AVERAGE CASE: 

For an average case, we had QuickSorterTester.java make arrays of random sizes
and fill them up with random numbers. 

We used QuickSortTester.java to run the qsort method many times (10,000 times)
on arrays of different lengths. Then, the average was of all the times for each
length was found. These are the results (regressions calculated via TI-83+). 

AVERAGE CASE: 

| Length   |    Time (nanoseconds)  |
| -------: | ---------------------: | 
| 1747     |         156028         |
| 1311     |         113889         |
| 1188     |         101149         |
| 1125     |          95836         |
| 1018     |          87527         |
| 2944     |         272934         |
| 2614     |         239222         |
| 2197     |         197715         |
| 2244     |         203152         |
| 2909     |         268288         |
| 3024     |         281249         |
| 3541     |         332583         |
| 3325     |         311485         |
| 3648     |         344622         |
| 3221     |         299538         |
| 4529     |         497968         |
| 4202     |         415003         |
| 4722     |         453698         |
| 4531     |         434074         |
| 4704     |         453043         |
| 5042     |         485588         |
| 5805     |         563243         |
| 5844     |         567661         |
| 5859     |         571552         |
| 5051     |         491657         |

n^2 r squared = .9934

n r squared = .99336

CONCLUSION: Since either one looks good, it'll be safe to assume that
the true answer is in the middle, nlog(n). 



BEST CASE:

| Length |            TIME (nanoseconds)          |
| -----: | --------------------------------------:|
| 3      | 8194922 ,  9997277 ,  11024331 , 8044360  |
| 4      | 12482053 , 12483031 , 10261251 , 12860416 |
| 5      | 8105953 ,  8821127  , 9331965 ,  10557488 |
| 6      | 12485475 , 13098481 , 14350891           |
| 7      | 12352510 , 13842008 , 16696836           |
| 8      | 9354452 ,  9728904 ,  14232102           |

n r squared = .1771

ln r squared = .196

n^2 r squared = .2245


CONCLUSION: All three look to be very alike. Therefore, I think it should be
between n^2 and log n. This means it is most like n or nlog(n). 




WORST CASE:

| Length  |  Time (nanoseconds)  |
| ------: | -------------------: |
| 1889    |          720989      |
| 1458    |          422754      |
| 2436    |          945038      |
| 2227    |          835668      |
| 3072    |         1351114      |
| 3523    |         1595472      |
| 4592    |         2293709      |
| 4365    |         2121899      |
| 5333    |         2778310      |
| 5767    |         2938221      |

n r squared = .274

ln r squared = .345

n^2 r squared = .543


CONCLUSION: n^2 is clearly the closest to 1 by far, so this is probably
order n^2. 

