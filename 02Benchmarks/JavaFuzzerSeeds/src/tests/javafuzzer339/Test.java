package tests.javafuzzer339;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 02:12:41 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-2L;
    public static boolean bFld=true;
    public static int iFld=0;
    public static volatile int iFld1=-20399;
    public static int iFld2=13;
    public static volatile float fFld=101.591F;

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l1, int i6) {

        int i7=-56217, i8=-22256, i9=-24, i10=10, i11=0, i12=171, i13=82, i14=-47;
        float f1=-54.807F;
        double d=1.84729;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -2229502602L);

        l1 = i6;
        for (i7 = 19; i7 < 341; i7++) {
            i6 += i7;
            i8 += i7;
        }
        l1 *= i6;
        for (i9 = 17; i9 < 361; i9++) {
            i6 += i7;
            lArr[i9 - 1] = -3;
            for (i11 = 1; 5 > i11; ++i11) {
                i10 -= (int)l1;
                for (i13 = 1; i13 < 2; ++i13) {
                    switch (((i9 % 9) * 5) + 78) {
                    case 98:
                        i12 = (int)Test.instanceCount;
                        Test.instanceCount -= i14;
                        Test.instanceCount -= i6;
                        break;
                    case 91:
                        if (Test.bFld) break;
                        break;
                    case 113:
                        i14 -= 1;
                        break;
                    case 119:
                    case 104:
                        i10 -= i13;
                    case 82:
                        f1 += Test.instanceCount;
                        break;
                    case 89:
                        l1 += (i13 * i11);
                        break;
                    case 106:
                        Test.instanceCount >>>= 112;
                        break;
                    case 118:
                    default:
                        d = l1;
                    }
                }
            }
        }
        vMeth1_check_sum += l1 + i6 + i7 + i8 + i9 + i10 + i11 + i12 + i13 + i14 + Float.floatToIntBits(f1) +
            Double.doubleToLongBits(d) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(long l) {

        int i15=-175, i16=39937, iArr1[]=new int[N], iArr2[][]=new int[N][N];
        float f2=0.436F;
        double d1=-71.52641;

        FuzzerUtils.init(iArr1, -56860);
        FuzzerUtils.init(iArr2, 30974);

        vMeth1(Test.instanceCount, Test.iFld);
        iArr1[(Test.iFld >>> 1) % N] *= Test.iFld;
        for (i15 = 5; i15 < 256; ++i15) {
            iArr2 = iArr2;
            if (false) {
                Test.iFld = Test.iFld;
                Test.iFld += Test.iFld;
                if (Test.bFld) break;
            }
            i16 += (i15 * i15);
            f2 *= Test.iFld;
            i16 >>>= i16;
            iArr1[i15] -= (int)f2;
            i16 = (int)d1;
            Test.instanceCount -= i15;
            Test.iFld -= (int)l;
        }
        vMeth_check_sum += l + i15 + i16 + Float.floatToIntBits(f2) + Double.doubleToLongBits(d1) +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(iArr2);
    }

    public static long lMeth(int i3) {

        float f=-1.392F;
        int i4=-159, i5=0, i17=58066, i18=51924, i19=-10, i20=-53060;
        short s=23798;
        byte by=39;

        i3 = 11924;
        i3 += (int)(f = (Test.instanceCount + (Test.instanceCount + 0.291F)));
        for (i4 = 13; i4 < 280; i4++) {
            i3 *= (int)Test.instanceCount;
            vMeth(Test.instanceCount);
            f += Test.instanceCount;
            for (i17 = 1; i17 < 6; i17++) {
                i19 = 1;
                while (++i19 < 2) {
                    Test.iFld += 13;
                    s = by;
                    f += (i19 - i3);
                }
                Test.instanceCount = i18;
                i20 = 2;
                do {
                    Test.iFld = i5;
                    i3 = (int)Test.instanceCount;
                } while (--i20 > 0);
            }
        }
        long meth_res = i3 + Float.floatToIntBits(f) + i4 + i5 + i17 + i18 + i19 + s + by + i20;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=194, i1=22845, i2=-7, i21=40734, i22=-54225, i23=11, i24=36969, iArr[]=new int[N];
        long l2=10L;
        double d2=0.105140;
        byte by1=-51, by2=-72;

        FuzzerUtils.init(iArr, 7);

        Test.instanceCount += iArr[(i >>> 1) % N];
        iArr = (iArr = (iArr = (iArr = iArr)));
        i = -21013;
        for (i1 = 127; i1 > 1; --i1) {
            i2 = Integer.reverseBytes((int)((i2 - i1) - lMeth(-36877)));
            i += (((i1 * Test.iFld1) + Test.iFld1) - Test.iFld1);
            if (Test.bFld) break;
            for (i21 = i1; i21 < 199; i21++) {
                l2 = 1;
                while (++l2 < 1) {
                    Test.iFld1 += (int)(1.985F + (l2 * l2));
                    d2 = by1;
                    Test.iFld2 = by1;
                    Test.iFld += (int)(l2 | i2);
                }
                switch (((i21 % 2) * 5) + 104) {
                case 110:
                    Test.iFld1 *= (int)d2;
                    Test.iFld2 = by2;
                    i -= (int)d2;
                    Test.iFld1 *= (int)d2;
                case 106:
                    i22 = Test.iFld;
                    for (i23 = 1; 1 > i23; ++i23) {
                        i22 += (((i23 * Test.iFld2) + i23) - Test.instanceCount);
                        switch ((i1 % 2) + 86) {
                        case 86:
                        case 87:
                            Test.iFld += (int)2460833707L;
                            break;
                        }
                        Test.iFld2 = (int)Test.fFld;
                        Test.fFld += Test.iFld1;
                        i24 += (i23 * Test.instanceCount);
                        i22 |= i21;
                        iArr = iArr;
                        i2 = Test.iFld;
                        iArr = FuzzerUtils.int1array(N, (int)-5);
                    }
                default:
                    Test.instanceCount += 5;
                }
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
