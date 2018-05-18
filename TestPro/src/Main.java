javac:

java:
.
+-- JUnit Jupiter [OK]
| '-- AllTests [OK]
| +-- testInsert_FoldingQuadratic() [OK]
| +-- testFind_MidSquareLinear() [OK]
| +-- testReadTestFile2_FoldingQuadratic() [OK]
| +-- testDelete_MidSquareLinear() [OK]
| +-- testDelete_MidSquareQuadratic() [OK]
| +-- testFind_DivisionQuadratic() [OK]
| +-- testCollisionsTestFile2_FoldingLinear() [X] Home address must be at 175 ==> expected: <175> but was: <56>
| +-- testDelete_FoldingLinear() [OK]
| +-- testFind_DivisionLinear() [OK]
| +-- testLargeAddressLengths_FoldingQuadratic() [X] folding error at large addresses ==> expected: <160> but was: <504>
| +-- testCollisionAdress_MidSquareLinear() [OK]
| +-- testCapacityTestFile2_FoldingQuadratic() [OK]
| +-- testHomeAdress_MidSquareQuadratic() [OK]
| +-- testReadTestFile1_MidSquareLinear() [OK]
| +-- testCollisionAdress_FoldingQuadratic() [OK]
| +-- testHomeAdress_DivisionQuadratic() [OK]
| +-- testHomeAdress_FoldingQuadratic() [OK]
| +-- testCollisionsTestFile2_MidSquareQuadratic() [X] a collision must have happened for key UGWAQDPJJ ==> expected: not <null>
| +-- testReadTestFile1_MidSquareQuadractic() [OK]
| +-- testReadTestFile1_FoldingQuadratic() [OK]
| +-- testReadTestFile2_MidSquareQuadractic() [OK]
| +-- testFind_FoldingQuadratic() [OK]
| +-- testCollisionAdress_MidSquareQuadratic() [OK]
| +-- testLargeAddressLengths_FoldingLinear() [X] folding error at large addresses ==> expected: <44> but was: <623>
| +-- testHomeAdress_FoldingLinear() [OK]
| +-- testFind_MidSquareQuadratic() [OK]
| +-- testDelete_DivisionLinear() [OK]
| +-- testInsert_DivisionQuadratic() [OK]
| +-- testCorrectPositionTestFile2_MidSquareQuadratic() [X] key G4BFF9ZFS is not at original position ==> expected: <null> but was: <[I@6122cec6>
| +-- testCorrectPositionTestFile2_DivisionQuadratic() [X] key G4BFF9ZFS is not at original position ==> expected: <null> but was: <[I@486d0f61>
| +-- testLargeAddressLengths_MidsquareQuadratic() [X] folding error at large addresses ==> expected: <736> but was: <503>
| +-- testFind_FoldingLinear() [OK]
| +-- testCorrectPositionTestFile2_FoldingLinear() [X] Home address must be at 293 ==> expected: <293> but was: <49>
| +-- testCapacityTestFile2_DivisionQuadratic() [OK]
| +-- testReadTestFile2_DivisionQuadratic() [OK]
| +-- testReadTestFile2_MidSquareLinear() [OK]
| +-- testReadTestFile1_FoldingLinear() [OK]
| +-- testCapacityTestFile2_MidSquareLinear() [OK]
| +-- testDelete_FoldingQuadratic() [OK]
| +-- testInsert_MidSquareLinear() [OK]
| +-- testCorrectPositionTestFile2_FoldingQuadratic() [X] Home address must be at 28 ==> expected: <28> but was: <12>
| +-- testCollisionsTestFile2_DivisionQuadratic() [X] a collision must have happened for key S04XX3HO6 ==> expected: not <null>
| +-- testCapacityTestFile2_MidSquareQuadratic() [OK]
| +-- testLargeAddressLengths_MidsquareLinear() [X] folding error at large addresses ==> expected: <482> but was: <409>
| +-- testCollisionAdress_DivisionQuadratic() [OK]
| +-- testReadTestFile1_DivisionQuadratic() [OK]
| +-- testInsert_FoldingLinear() [OK]
| +-- testCorrectPositionTestFile2_MidSquareLinear() [X] key 6QCD2DO9K is not at original position ==> expected: <null> but was: <[I@58291182>
| +-- testCapacityTestFile2_FoldingLinear() [OK]
| +-- testReadTestFile2_DivisionLinear() [OK]
| +-- testHomeAdress_MidSquareLinear() [OK]
| +-- testCollisionAdress_FoldingLinear() [OK]
| +-- testCollisionsTestFile2_FoldingQuadratic() [X] Home address must be at 175 ==> expected: <175> but was: <56>
| +-- testCorrectPositionTestFile2_DivisionLinear() [X] key PBNXCLREK is not at original position ==> expected: <null> but was: <[I@10e8e71b>
| +-- testCollisionAdress_DivisionLinear() [OK]
| +-- testReadTestFile2_FoldingLinear() [OK]
| +-- testCollisionsTestFile2_DivisionLinear() [X] a collision must have happened for key S04XXGKQ3 ==> expected: not <null>
| +-- testDelete_DivisionQuadratic() [OK]
| +-- testReadTestFile1_DivisionLinear() [OK]
| +-- testCapacityTestFile2_DivisionLinear() [OK]
| +-- testInsert_DivisionLinear() [OK]
| +-- testHomeAdress_DivisionLinear() [OK]
| +-- testInsert_MidSquareQuadratic() [OK]
| '-- testCollisionsTestFile2_MidSquareLinear() [X] a collision must have happened for key UGWAQDPJJ ==> expected: not <null>
'-- JUnit Vintage [OK]

Failures (16):
JUnit Jupiter:AllTests:testCollisionsTestFile2_FoldingLinear()
MethodSource [className = 'frame.AllTests', methodName = 'testCollisionsTestFile2_FoldingLinear', methodParameterTypes = '']
=> org.opentest4j.AssertionFailedError: Home address must be at 175 ==> expected: <175> but was: <56>
org.junit.jupiter.api.AssertionUtils.fail(AssertionUtils.java:52)
org.junit.jupiter.api.AssertEquals.failNotEqual(AssertEquals.java:197)
org.junit.jupiter.api.AssertEquals.assertEquals(AssertEquals.java:154)
org.junit.jupiter.api.Assertions.assertEquals(Assertions.java:312)
frame.AllTests.lambda$16(AllTests.java:532)
org.junit.jupiter.api.AssertTimeout.lambda$assertTimeoutPreemptively$2(AssertTimeout.java:100)
org.junit.jupiter.api.AssertTimeout.lambda$assertTimeoutPreemptively$4(AssertTimeout.java:134)
java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
[...]
JUnit Jupiter:AllTests:testLargeAddressLengths_FoldingQuadratic()
MethodSource [className = 'frame.AllTests', methodName = 'testLargeAddressLengths_FoldingQuadratic', methodParameterTypes = '']
=> org.opentest4j.AssertionFailedError: folding error at large addresses ==> expected: <160> but was: <504>
org.junit.jupiter.api.AssertionUtils.fail(AssertionUtils.java:52)
org.junit.jupiter.api.AssertEquals.failNotEqual(AssertEquals.java:197)
org.junit.jupiter.api.AssertEquals.assertEquals(AssertEquals.java:154)
org.junit.jupiter.api.Assertions.assertEquals(Assertions.java:312)
frame.AllTests.lambda$1(AllTests.java:183)
org.junit.jupiter.api.AssertTimeout.lambda$assertTimeoutPreemptively$2(AssertTimeout.java:100)
org.junit.jupiter.api.AssertTimeout.lambda$assertTimeoutPreemptively$4(AssertTimeout.java:134)
java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
[...]
JUnit Jupiter:AllTests:testCollisionsTestFile2_MidSquareQuadratic()
MethodSource [className = 'frame.AllTests', methodName = 'testCollisionsTestFile2_MidSquareQuadratic', methodParameterTypes = '']
=> org.opentest4j.AssertionFailedError: a collision must have happened for key UGWAQDPJJ ==> expected: not <null>
org.junit.jupiter.api.AssertionUtils.fail(AssertionUtils.java:36)
org.junit.jupiter.api.Assertions.fail(Assertions.java:62)
org.junit.jupiter.api.AssertNotNull.failNull(AssertNotNull.java:49)
org.junit.jupiter.api.AssertNotNull.assertNotNull(AssertNotNull.java:38)
org.junit.jupiter.api.Assertions.assertNotNull(Assertions.java:244)
frame.AllTests.lambda$13(AllTests.java:455)
org.junit.jupiter.api.AssertTimeout.lambda$assertTimeoutPreemptively$2(AssertTimeout.java:100)
org.junit.jupiter.api.AssertTimeout.lambda$assertTimeoutPreemptively$4(AssertTimeout.java:134)
java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
[...]
JUnit Jupiter:AllTests:testLargeAddressLengths_FoldingLinear()
MethodSource [className = 'frame.AllTests', methodName = 'testLargeAddressLengths_FoldingLinear', methodParameterTypes = '']
=> org.opentest4j.AssertionFailedError: folding error at large addresses ==> expected: <44> but was: <623>
org.junit.jupiter.api.AssertionUtils.fail(AssertionUtils.java:52)
org.junit.jupiter.api.AssertEquals.failNotEqual(AssertEquals.java:197)
org.junit.jupiter.api.AssertEquals.assertEquals(AssertEquals.java:154)
org.junit.jupiter.api.Assertions.assertEquals(Assertions.java:312)
frame.AllTests.lambda$0(AllTests.java:154)
org.junit.jupiter.api.AssertTimeout.lambda$assertTimeoutPreemptively$2(AssertTimeout.java:100)
org.junit.jupiter.api.AssertTimeout.lambda$assertTimeoutPreemptively$4(AssertTimeout.java:134)
java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
[...]
JUnit Jupiter:AllTests:testCorrectPositionTestFile2_MidSquareQuadratic()
MethodSource [className = 'frame.AllTests', methodName = 'testCorrectPositionTestFile2_MidSquareQuadratic', methodParameterTypes = '']
=> org.opentest4j.AssertionFailedError: key G4BFF9ZFS is not at original position ==> expected: <null> but was: <[I@6122cec6>
org.junit.jupiter.api.AssertionUtils.fail(AssertionUtils.java:52)
org.junit.jupiter.api.AssertNull.failNotNull(AssertNull.java:50)
org.junit.jupiter.api.AssertNull.assertNull(AssertNull.java:39)
org.junit.jupiter.api.Assertions.assertNull(Assertions.java:219)
frame.AllTests.lambda$14(AllTests.java:496)
org.junit.jupiter.api.AssertTimeout.lambda$assertTimeoutPreemptively$2(AssertTimeout.java:100)
org.junit.jupiter.api.AssertTimeout.lambda$assertTimeoutPreemptively$4(AssertTimeout.java:134)
java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
[...]
JUnit Jupiter:AllTests:testCorrectPositionTestFile2_DivisionQuadratic()
MethodSource [className = 'frame.AllTests', methodName = 'testCorrectPositionTestFile2_DivisionQuadratic', methodParameterTypes = '']
=> org.opentest4j.AssertionFailedError: key G4BFF9ZFS is not at original position ==> expected: <null> but was: <[I@486d0f61>
org.junit.jupiter.api.AssertionUtils.fail(AssertionUtils.java:52)
org.junit.jupiter.api.AssertNull.failNotNull(AssertNull.java:50)
org.junit.jupiter.api.AssertNull.assertNull(AssertNull.java:39)
org.junit.jupiter.api.Assertions.assertNull(Assertions.java:219)
frame.AllTests.lambda$8(AllTests.java:348)
org.junit.jupiter.api.AssertTimeout.lambda$assertTimeoutPreemptively$2(AssertTimeout.java:100)
org.junit.jupiter.api.AssertTimeout.lambda$assertTimeoutPreemptively$4(AssertTimeout.java:134)
java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
[...]
JUnit Jupiter:AllTests:testLargeAddressLengths_MidsquareQuadratic()
MethodSource [className = 'frame.AllTests', methodName = 'testLargeAddressLengths_MidsquareQuadratic', methodParameterTypes = '']
=> org.opentest4j.AssertionFailedError: folding error at large addresses ==> expected: <736> but was: <503>
org.junit.jupiter.api.AssertionUtils.fail(AssertionUtils.java:52)
org.junit.jupiter.api.AssertEquals.failNotEqual(AssertEquals.java:197)
org.junit.jupiter.api.AssertEquals.assertEquals(AssertEquals.java:154)
org.junit.jupiter.api.Assertions.assertEquals(Assertions.java:312)
frame.AllTests.lambda$3(AllTests.java:239)
org.junit.jupiter.api.AssertTimeout.lambda$assertTimeoutPreemptively$2(AssertTimeout.java:100)
org.junit.jupiter.api.AssertTimeout.lambda$assertTimeoutPreemptively$4(AssertTimeout.java:134)
java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
[...]
JUnit Jupiter:AllTests:testCorrectPositionTestFile2_FoldingLinear()
MethodSource [className = 'frame.AllTests', methodName = 'testCorrectPositionTestFile2_FoldingLinear', methodParameterTypes = '']
=> org.opentest4j.AssertionFailedError: Home address must be at 293 ==> expected: <293> but was: <49>
org.junit.jupiter.api.AssertionUtils.fail(AssertionUtils.java:52)
org.junit.jupiter.api.AssertEquals.failNotEqual(AssertEquals.java:197)
org.junit.jupiter.api.AssertEquals.assertEquals(AssertEquals.java:154)
org.junit.jupiter.api.Assertions.assertEquals(Assertions.java:312)
frame.AllTests.lambda$17(AllTests.java:558)
org.junit.jupiter.api.AssertTimeout.lambda$assertTimeoutPreemptively$2(AssertTimeout.java:100)
org.junit.jupiter.api.AssertTimeout.lambda$assertTimeoutPreemptively$4(AssertTimeout.java:134)
java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
[...]
JUnit Jupiter:AllTests:testCorrectPositionTestFile2_FoldingQuadratic()
MethodSource [className = 'frame.AllTests', methodName = 'testCorrectPositionTestFile2_FoldingQuadratic', methodParameterTypes = '']
=> org.opentest4j.AssertionFailedError: Home address must be at 28 ==> expected: <28> but was: <12>
org.junit.jupiter.api.AssertionUtils.fail(AssertionUtils.java:52)
org.junit.jupiter.api.AssertEquals.failNotEqual(AssertEquals.java:197)
org.junit.jupiter.api.AssertEquals.assertEquals(AssertEquals.java:154)
org.junit.jupiter.api.Assertions.assertEquals(Assertions.java:312)
frame.AllTests.lambda$20(AllTests.java:618)
org.junit.jupiter.api.AssertTimeout.lambda$assertTimeoutPreemptively$2(AssertTimeout.java:100)
org.junit.jupiter.api.AssertTimeout.lambda$assertTimeoutPreemptively$4(AssertTimeout.java:134)
java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
[...]
JUnit Jupiter:AllTests:testCollisionsTestFile2_DivisionQuadratic()
MethodSource [className = 'frame.AllTests', methodName = 'testCollisionsTestFile2_DivisionQuadratic', methodParameterTypes = '']
=> org.opentest4j.AssertionFailedError: a collision must have happened for key S04XX3HO6 ==> expected: not <null>
org.junit.jupiter.api.AssertionUtils.fail(AssertionUtils.java:36)
org.junit.jupiter.api.Assertions.fail(Assertions.java:62)
org.junit.jupiter.api.AssertNotNull.failNull(AssertNotNull.java:49)
org.junit.jupiter.api.AssertNotNull.assertNotNull(AssertNotNull.java:38)
org.junit.jupiter.api.Assertions.assertNotNull(Assertions.java:244)
frame.AllTests.lambda$7(AllTests.java:316)
org.junit.jupiter.api.AssertTimeout.lambda$assertTimeoutPreemptively$2(AssertTimeout.java:100)
org.junit.jupiter.api.AssertTimeout.lambda$assertTimeoutPreemptively$4(AssertTimeout.java:134)
java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
[...]
JUnit Jupiter:AllTests:testLargeAddressLengths_MidsquareLinear()
MethodSource [className = 'frame.AllTests', methodName = 'testLargeAddressLengths_MidsquareLinear', methodParameterTypes = '']
=> org.opentest4j.AssertionFailedError: folding error at large addresses ==> expected: <482> but was: <409>
org.junit.jupiter.api.AssertionUtils.fail(AssertionUtils.java:52)
org.junit.jupiter.api.AssertEquals.failNotEqual(AssertEquals.java:197)
org.junit.jupiter.api.AssertEquals.assertEquals(AssertEquals.java:154)
org.junit.jupiter.api.Assertions.assertEquals(Assertions.java:312)
frame.AllTests.lambda$2(AllTests.java:211)
org.junit.jupiter.api.AssertTimeout.lambda$assertTimeoutPreemptively$2(AssertTimeout.java:100)
org.junit.jupiter.api.AssertTimeout.lambda$assertTimeoutPreemptively$4(AssertTimeout.java:134)
java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
[...]
JUnit Jupiter:AllTests:testCorrectPositionTestFile2_MidSquareLinear()
MethodSource [className = 'frame.AllTests', methodName = 'testCorrectPositionTestFile2_MidSquareLinear', methodParameterTypes = '']
=> org.opentest4j.AssertionFailedError: key 6QCD2DO9K is not at original position ==> expected: <null> but was: <[I@58291182>
org.junit.jupiter.api.AssertionUtils.fail(AssertionUtils.java:52)
org.junit.jupiter.api.AssertNull.failNotNull(AssertNull.java:50)
org.junit.jupiter.api.AssertNull.assertNull(AssertNull.java:39)
org.junit.jupiter.api.Assertions.assertNull(Assertions.java:219)
frame.AllTests.lambda$11(AllTests.java:419)
org.junit.jupiter.api.AssertTimeout.lambda$assertTimeoutPreemptively$2(AssertTimeout.java:100)
org.junit.jupiter.api.AssertTimeout.lambda$assertTimeoutPreemptively$4(AssertTimeout.java:134)
java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
[...]
JUnit Jupiter:AllTests:testCollisionsTestFile2_FoldingQuadratic()
MethodSource [className = 'frame.AllTests', methodName = 'testCollisionsTestFile2_FoldingQuadratic', methodParameterTypes = '']
=> org.opentest4j.AssertionFailedError: Home address must be at 175 ==> expected: <175> but was: <56>
org.junit.jupiter.api.AssertionUtils.fail(AssertionUtils.java:52)
org.junit.jupiter.api.AssertEquals.failNotEqual(AssertEquals.java:197)
org.junit.jupiter.api.AssertEquals.assertEquals(AssertEquals.java:154)
org.junit.jupiter.api.Assertions.assertEquals(Assertions.java:312)
frame.AllTests.lambda$19(AllTests.java:592)
org.junit.jupiter.api.AssertTimeout.lambda$assertTimeoutPreemptively$2(AssertTimeout.java:100)
org.junit.jupiter.api.AssertTimeout.lambda$assertTimeoutPreemptively$4(AssertTimeout.java:134)
java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
[...]
JUnit Jupiter:AllTests:testCorrectPositionTestFile2_DivisionLinear()
MethodSource [className = 'frame.AllTests', methodName = 'testCorrectPositionTestFile2_DivisionLinear', methodParameterTypes = '']
=> org.opentest4j.AssertionFailedError: key PBNXCLREK is not at original position ==> expected: <null> but was: <[I@10e8e71b>
org.junit.jupiter.api.AssertionUtils.fail(AssertionUtils.java:52)
org.junit.jupiter.api.AssertNull.failNotNull(AssertNull.java:50)
org.junit.jupiter.api.AssertNull.assertNull(AssertNull.java:39)
org.junit.jupiter.api.Assertions.assertNull(Assertions.java:219)
frame.AllTests.lambda$5(AllTests.java:286)
org.junit.jupiter.api.AssertTimeout.lambda$assertTimeoutPreemptively$2(AssertTimeout.java:100)
org.junit.jupiter.api.AssertTimeout.lambda$assertTimeoutPreemptively$4(AssertTimeout.java:134)
java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
[...]
JUnit Jupiter:AllTests:testCollisionsTestFile2_DivisionLinear()
MethodSource [className = 'frame.AllTests', methodName = 'testCollisionsTestFile2_DivisionLinear', methodParameterTypes = '']
=> org.opentest4j.AssertionFailedError: a collision must have happened for key S04XXGKQ3 ==> expected: not <null>
org.junit.jupiter.api.AssertionUtils.fail(AssertionUtils.java:36)
org.junit.jupiter.api.Assertions.fail(Assertions.java:62)
org.junit.jupiter.api.AssertNotNull.failNull(AssertNotNull.java:49)
org.junit.jupiter.api.AssertNotNull.assertNotNull(AssertNotNull.java:38)
org.junit.jupiter.api.Assertions.assertNotNull(Assertions.java:244)
frame.AllTests.lambda$4(AllTests.java:253)
org.junit.jupiter.api.AssertTimeout.lambda$assertTimeoutPreemptively$2(AssertTimeout.java:100)
org.junit.jupiter.api.AssertTimeout.lambda$assertTimeoutPreemptively$4(AssertTimeout.java:134)
java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
[...]
JUnit Jupiter:AllTests:testCollisionsTestFile2_MidSquareLinear()
MethodSource [className = 'frame.AllTests', methodName = 'testCollisionsTestFile2_MidSquareLinear', methodParameterTypes = '']
=> org.opentest4j.AssertionFailedError: a collision must have happened for key UGWAQDPJJ ==> expected: not <null>
org.junit.jupiter.api.AssertionUtils.fail(AssertionUtils.java:36)
org.junit.jupiter.api.Assertions.fail(Assertions.java:62)
org.junit.jupiter.api.AssertNotNull.failNull(AssertNotNull.java:49)
org.junit.jupiter.api.AssertNotNull.assertNotNull(AssertNotNull.java:38)
org.junit.jupiter.api.Assertions.assertNotNull(Assertions.java:244)
frame.AllTests.lambda$10(AllTests.java:383)
org.junit.jupiter.api.AssertTimeout.lambda$assertTimeoutPreemptively$2(AssertTimeout.java:100)
org.junit.jupiter.api.AssertTimeout.lambda$assertTimeoutPreemptively$4(AssertTimeout.java:134)
java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
[...]

Test run finished after 5626 ms
[ 3 containers found ]
[ 0 containers skipped ]
[ 3 containers started ]
[ 0 containers aborted ]
[ 3 containers successful ]
[ 0 containers failed ]
[ 64 tests found ]
[ 0 tests skipped ]
[ 64 tests started ]
[ 0 tests aborted ]
[ 48 tests successful ]
[ 16 tests failed ]
