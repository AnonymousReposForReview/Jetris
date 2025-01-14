package tests.javafuzzer143;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 23:01:56 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-8550327938086815135L;
    public static boolean bFld=true;
    public static volatile double dFld=0.90030;
    public static volatile double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 0.5516);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i1) {

        int i2=-46914, i3=-47961, i4=73, i5=38580, i6=-3, i7=-6, i8=2487;
        long l1=-208L;

        i1 = i1;
        Test.bFld = Test.bFld;
        for (i2 = 9; i2 < 361; i2++) {
            for (i4 = 5; i4 > i2; i4--) {
                Test.dArrFld[i4 - 1] -= i5;
                for (i6 = i2; i6 < 1; i6++) {
                    i3 <<= 86;
                    i3 += (i6 + i4);
                    i1 -= (int)Test.instanceCount;
                    i5 += i8;
                    if (i1 != 0) {
                        vMeth2_check_sum += i1 + i2 + i3 + i4 + i5 + i6 + i7 + i8 + l1;
                        return;
                    }
                    switch (((i4 % 1) * 5) + 37) {
                    case 38:
                        i8 -= i4;
                        Test.instanceCount *= i2;
                        break;
                    }
                    i1 += (int)l1;
                }
            }
        }
        vMeth2_check_sum += i1 + i2 + i3 + i4 + i5 + i6 + i7 + i8 + l1;
    }

    public static void vMeth1(int i) {

        byte by=19;
        int iArr[]=new int[N];

        FuzzerUtils.init(iArr, 13);

        vMeth2(i);
        iArr[(i >>> 1) % N] = by;
        vMeth1_check_sum += i + by + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(long l) {

        int i9=69, i10=36, i11=-104, i12=9, i13=-153, i14=122, i15=-204;
        float f=62.944F;

        vMeth1(i9);
        i10 = 1;
        while (++i10 < 334) {
            if (Test.bFld) {
                for (i11 = 1; i11 < 5; ++i11) {
                    l = l;
                    i9 |= i12;
                    i13 = 1;
                    do {
                        Test.instanceCount = -16345;
                        if (i9 != 0) {
                            vMeth_check_sum += l + i9 + i10 + i11 + i12 + i13 + Float.floatToIntBits(f) + i14 + i15;
                            return;
                        }
                    } while (++i13 < 2);
                    Test.instanceCount += (i11 * l);
                    i9 = i9;
                    f += i13;
                    for (i14 = 1; 2 > i14; ++i14) {
                        i12 += (int)f;
                        i12 = (int)Test.instanceCount;
                    }
                }
            }
        }
        vMeth_check_sum += l + i9 + i10 + i11 + i12 + i13 + Float.floatToIntBits(f) + i14 + i15;
    }

    public void mainTest(String[] strArr1) {

        int i16=-148, i17=10, i18=-12, i19=-61, i20=-56, iArr1[]=new int[N];
        long l2=15L;
        float f1=-36.735F;
        short s=8294;

        FuzzerUtils.init(iArr1, 14);

        vMeth(Test.instanceCount);
        for (i16 = 15; i16 < 304; i16++) {
            i17 = i16;
            for (l2 = 4; l2 < 87; ++l2) {
                i17 += (int)(l2 + f1);
                i17 += i16;
                switch ((int)((l2 % 2) + 51)) {
                case 51:
                    i18 = -218;
                    break;
                case 52:
                }
                iArr1[(int)(l2 + 1)] = s;
                Test.dFld -= -63374;
                if (Test.bFld) {
                    if (false) break;
                    iArr1[(int)(l2 + 1)] += -12;
                    i17 += (int)(((l2 * i18) + Test.instanceCount) - Test.instanceCount);
                    i17 += i18;
                } else if (Test.bFld) {
                    Test.dFld = 0;
                    if (Test.bFld) continue;
                }
                i19 = 2;
                while (--i19 > 0) {
                    i17 >>= i17;
                    i17 += i17;
                    Test.instanceCount += (long)Test.dFld;
                    f1 += i19;
                    Test.instanceCount += i19;
                    i18 = i18;
                    try {
                        iArr1[i16] = (iArr1[(int)(l2 - 1)] % 22473);
                        i17 = (40861 / i17);
                        i18 = (i19 / 56);
                    } catch (ArithmeticException a_e) {}
                }
            }
            f1 *= (float)Test.dFld;
            Test.instanceCount += i16;
            Test.instanceCount += (((i16 * i20) + i20) - i18);
            i20 = (int)f1;
            iArr1[i16 - 1] *= -8;
        }



    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr);
            }
         } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
         }
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
