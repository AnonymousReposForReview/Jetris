package tests.javafuzzer2490;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 15:25:12 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-2625976504L;
    public static float fFld=112.369F;
    public static volatile double dFld=-1.95355;
    public boolean bFld=true;
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 55721L);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i1, int i2) {

        int i3=74, i4=57271, i5=-12, i6=-71, i7=-5, i8=-3, i9=129;
        short s1=465;
        byte byArr[][]=new byte[N][N];

        FuzzerUtils.init(byArr, (byte)-80);

        for (i3 = 17; i3 < 303; i3++) {
            for (i5 = 1; i5 < 6; i5++) {
                Test.fFld -= i1;
                i4 += (((i5 * i3) + i4) - i7);
                s1 -= (short)-101;
                i6 <<= i3;
                i1 ^= i7;
                Test.lArrFld[i5 + 1] *= i1;
                i6 -= i1;
                for (i8 = 1; i8 < 2; i8++) {
                    Test.instanceCount -= Test.instanceCount;
                    Test.fFld += (0.823F + (i8 * i8));
                    byArr[i3][i5] >>>= (byte)i3;
                    i6 += (int)Test.fFld;
                    i1 *= (int)Test.fFld;
                }
            }
        }
        vMeth1_check_sum += i1 + i2 + i3 + i4 + i5 + i6 + i7 + s1 + i8 + i9 + FuzzerUtils.checkSum(byArr);
    }

    public static void vMeth(long l, long l1) {

        int i10=-55361, i11=-179, i12=74, i13=44494, i14=224, i15=-8339, i16=245, i17=-11, i18=-59739, iArr[]=new
            int[N];
        byte by=87;
        short s2=-13847;

        FuzzerUtils.init(iArr, 2);

        switch (((((-iArr[(151 >>> 1) % N]) >>> 1) % 1) * 5) + 116) {
        case 121:
            vMeth1(i10, i10);
            for (i11 = 7; i11 < 316; i11++) {
                for (i13 = 1; i13 < 5; i13++) {
                    i10 += (((i13 * i10) + i14) - l);
                    i14 = i12;
                    for (i15 = 2; 1 < i15; i15--) {
                        if (true) break;
                        by *= (byte)-9;
                        Test.lArrFld[i11 - 1] += l;
                    }
                    by += (byte)i13;
                    s2 += (short)(i13 + l);
                }
                for (i17 = 1; i17 < 5; i17++) {
                    i14 = (int)Test.dFld;
                }
            }
            break;
        }
        i12 = i16;
        vMeth_check_sum += l + l1 + i10 + i11 + i12 + i13 + i14 + i15 + i16 + by + s2 + i17 + i18 +
            FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth() {


        vMeth(Test.instanceCount, Test.instanceCount);
        long meth_res = 0;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-10, i19=-1, i20=57, i21=-11, i22=89, i23=24439, i24=5, iArr1[]=new int[N];
        byte by1=107;
        long l2=-3884174570L;
        short sArr[]=new short[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(sArr, (short)6636);
        FuzzerUtils.init(iArr1, 228);
        FuzzerUtils.init(fArr, -111.1F);

        for (short s : sArr) {
            i = 1;
            do {
                Test.fFld += i;
                Test.instanceCount = (i * (iMeth() + i));
            } while (++i < 63);
        }
        by1 <<= (byte)i;
        for (l2 = 11; l2 < 234; ++l2) {
            if (bFld) {
                if (bFld) break;
                Test.fFld = (float)Test.dFld;
                i19 += (int)(((l2 * i) + l2) - i);
                for (i20 = 113; i20 > 6; --i20) {
                    i21 += (i20 | i19);
                    i22 = 1;
                    while (++i22 < 2) {
                        Test.instanceCount *= i;
                        i19 <<= i22;
                        i21 += (i22 - l2);
                    }
                    Test.dFld = Test.instanceCount;
                    Test.instanceCount += (long)Test.fFld;
                    i19 = 238;
                    iArr1[i20] = (int)l2;
                    iArr1[i20] *= i20;
                    i19 += (int)l2;
                    for (i23 = 2; i23 > 1; i23--) {
                        if (bFld) continue;
                        i24 = (int)-2127106661L;
                        i21 *= 37523;
                        if (bFld) {
                            i24 /= (int)((long)(Test.fFld) | 1);
                            i19 = i23;
                            fArr[i20] = (float)Test.dFld;
                        } else if (bFld) {
                            i19 += (11317 + (i23 * i23));
                        }
                    }
                }
            } else if (bFld) {
                i19 >>= i24;
            } else if (bFld) {
                i21 = -4;
            } else {
                Test.instanceCount ^= i19;
            }
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
