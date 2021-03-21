# RadixSort

Java implementation of Radix sort (LSD)

## Benchmarks

CPU: Intel Core i7-8750H CPU @ 2.20GHz

#### Array size - 10M elements: 
| Array size to sort  | Generated numbers | Time       |
|:-------------------:|:-----------------:|:----------:|
| 10000000            | 0-100000          | 1.051 sec  |
| 10000000            | 0-10000           | 0.939 sec  |
| 10000000            | 0-1000            | 0.748 sec  |

#### Array size - 1M elements: 
| Array size to sort  | Generated numbers | Time       |
|:-------------------:|:-----------------:|:----------:|
| 1000000             | 0-100000          | 0.377 sec  |
| 1000000             | 0-10000           | 0.284 sec  |
| 1000000             | 0-1000            | 0.198 sec  |

#### Array size - 100K elements: 
| Array size to sort  | Generated numbers | Time       |
|:-------------------:|:-----------------:|:----------:|
| 100000              | 0-100000          | 0.033 sec  |
| 100000              | 0-10000           | 0.031 sec  |
| 100000              | 0-1000            | 0.030 sec  |

#### When max number is 1B: 
| Array size to sort  | Generated numbers | Time       |
|:-------------------:|:-----------------:|:----------:|
| 10000000            | 0-1000000000      | 1.790 sec  |
| 1000000             | 0-1000000000      | 0.777 sec  |
| 100000              | 0-1000000000      | 0.042 sec  |