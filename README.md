## neetcode-java

Collection of NeetCode / LeetCode solutions in Java.

### Project structure

- `pom.xml` — minimal Maven configuration (Java 17, JUnit 5).
- `src/main/java/com/grom/neetcode` — all solutions.

The project is not meant to be a runnable app, it is just a well-organized library of solutions.

### NeetCode 150 layout

NeetCode 150 problems are grouped by official topic into packages under:

- `com.grom.neetcode.neetcode150.arrays_hashing`
- `com.grom.neetcode.neetcode150.two_pointers`
- `com.grom.neetcode.neetcode150.sliding_window`
- `com.grom.neetcode.neetcode150.stack`
- `com.grom.neetcode.neetcode150.binary_search`
- `com.grom.neetcode.neetcode150.linked_list`
- `com.grom.neetcode.neetcode150.trees`
- `com.grom.neetcode.neetcode150.tries`
- `com.grom.neetcode.neetcode150.heap`
- `com.grom.neetcode.neetcode150.backtracking`
- `com.grom.neetcode.neetcode150.graphs`
- `com.grom.neetcode.neetcode150.advanced_graphs`
- `com.grom.neetcode.neetcode150.dp1d`
- `com.grom.neetcode.neetcode150.dp2d`
- `com.grom.neetcode.neetcode150.greedy`
- `com.grom.neetcode.neetcode150.intervals`
- `com.grom.neetcode.neetcode150.math_geometry`
- `com.grom.neetcode.neetcode150.bit_manipulation`

Any extra/non-NeetCode problems to be kept directly under `com.grom.neetcode` (e.g. `com.grom.neetcode.arrays`).

### Naming conventions

- **Packages**: lowercase, by topic (e.g. `arrays_hashing`, `two_pointers`, `sliding_window`).
- **Classes**: PascalCase with descriptive name, usually matching the NeetCode / LeetCode problem title:
  - `TwoSum`
  - `ValidPalindrome`
  - `BestTimeToBuyAndSellStock`
### Example (NeetCode 150)

Example problem class (NeetCode 150 — Arrays & Hashing — Two Sum):

```java
package com.grom.neetcode.neetcode150.arrays_hashing;

/**
 * NeetCode 150 - Arrays & Hashing - Two Sum.
 */
public class TwoSum_1 {

    /**
     * nums: input array
     * target: target sum
     * returns indices of the two numbers such that they add up to target
     */
    public int[] twoSum(int[] nums, int target) {
        // TODO: implement solution
        return new int[0];
    }
}
```

### How to add a new problem

1. Identify the NeetCode 150 topic (e.g. `arrays_hashing`, `graphs`).
2. Create a class in the appropriate package under `com.grom.neetcode.neetcode150.<topic>`.
3. Name the class after the problem (optionally with the LeetCode id suffix).
4. Implement the solution methods inside the class.


