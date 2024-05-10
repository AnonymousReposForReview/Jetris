package tests.javafuzzer2837;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 21:06:01 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=48434L;
    public static double dFld=60.13351;
    public static float fFld=-2.700F;
    public static int iFld=27107;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[][]=new long[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, -163);
        FuzzerUtils.init(Test.lArrFld, 24762L);
    }

    public static long byMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static double dMeth(long l, int i3, long l1) {

        double d1=0.119;
        int iArr[]=new int[N];

        FuzzerUtils.init(iArr, 122);

        i3 = (i3 += iArr[(i3 >>> 1) % N]);
        d1 *= (i3 + ((--i3) - (i3 - i3)));
        long meth_res = l + i3 + l1 + Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(iArr);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static void vMeth(int i8, short s1) {

        int i9=55939, i10=-149, i11=115, i12=90, i13=-57149, i14=6;
        double dArr[][]=new double[N][N];

        FuzzerUtils.init(dArr, 125.100156);

        dArr[(i8 >>> 1) % N][(i8 >>> 1) % N] -= i8;
        i8 = i8;
        Test.instanceCount *= i8;
        i8 = -2;
        i8 += i8;
        i8 -= (int)Test.dFld;
        for (i9 = 300; i9 > 10; i9--) {
            s1 += (short)(i9 * i9);
            for (i11 = 6; i11 > 1; i11 -= 2) {
                for (i13 = 1; i13 < 3; i13++) {
                    switch (((i9 % 2) * 5) + 17) {
                    case 19:
                        i8 *= -11;
                        Test.iArrFld[i13 - 1] = (int)Test.instanceCount;
                        break;
                    case 22:
                        Test.lArrFld[i9][i11 - 1] = Test.instanceCount;
                        Test.instanceCount += (i13 + Test.instanceCount);
                        break;
                    default:
                        i8 |= 0;
                    }
                }
            }
        }
        vMeth_check_sum += i8 + s1 + i9 + i10 + i11 + i12 + i13 + i14 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static int iMeth(int i6, int i7, byte by1) {

        short s2=-31079;

        vMeth(i7, s2);
        Test.fFld -= Test.instanceCount;
        Test.fFld = i7;
        long meth_res = i6 + i7 + by1 + s2;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static byte byMeth() {

        double d=56.108184;
        short s=-1237;
        int i2=7902, i4=-56875, i5=10, i15=131;
        float f=-67.832F;
        byte by=70;
        boolean b=false;

        d += (-((s++) + (i2 -= -173)));
        Test.instanceCount = (long)(((i2 / (Test.instanceCount | 1)) + (i2 + i2)) * (dMeth(-396411826L, i2,
            Test.instanceCount) + (Test.instanceCount + i2)));
        for (f = 15; f < 323; f++) {
            d += (i2 <<= (int)Test.instanceCount);
            i4 += (int)(((f * i2) + i4) - f);
            i5 = 1;
            do {
                by = (byte)(--i4);
                by += (byte)i5;
                i4 = (int)((i2++) - ((i2 - Test.instanceCount) - (i4 % (i4 | 1))));
                switch ((int)((f % 2) + 91)) {
                case 91:
                    i2 = (int)(iMeth(i5, 14, (byte)(118)) - Test.dFld);
                    i15 = 1;
                    do {
                        if (b) continue;
                        i4 >>= i4;
                        Test.instanceCount -= i2;
                    } while (++i15 < 1);
                case 92:
                    i4 = -53002;
                    break;
                default:
                    i2 = -110;
                }
            } while (++i5 < 5);
        }
        long meth_res = Double.doubleToLongBits(d) + s + i2 + Float.floatToIntBits(f) + i4 + i5 + by + i15 + (b ? 1 :
            0);
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=11300, i1=-30, i16=-54, i17=-3, i18=-25, i19=-3, i20=-13, i21=-7, i22=-89, i23=-75, iArr1[][]=new
            int[N][N];
        boolean b1=false;
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr1, -14);
        FuzzerUtils.init(fArr, -77.618F);

        if (b1) {
            i = 1;
            do {
                i1 -= byMeth();
            } while (++i < 203);
            i1 = -7;
            for (i16 = 2; i16 < 394; i16++) {
                for (i18 = i16; i18 < 64; i18 += 2) {
                    Test.instanceCount *= (long)-75.356F;
                    Test.iArrFld[i18] >>= i19;
                    Test.lArrFld[i16 + 1][i18 + 1] = Test.instanceCount;
                    i19 += (((i18 * i16) + Test.iFld) - i18);
                    for (i20 = 1; i20 < 1; i20++) {
                        Test.instanceCount = 53562;
                        iArr1 = iArr1;
                        Test.iFld = 225;
                    }
                    Test.iFld += i18;
                }
                i22 = 1;
                do {
                    fArr[i22] *= i21;
                    Test.instanceCount = i16;
                    i23 = 1;
                    while (++i23 < 1) {
                        i19 += Test.iFld;
                        Test.fFld -= i23;
                        i17 = -13;
                        i19 *= i16;
                        i21 += (((i23 * Test.instanceCount) + i1) - i17);
                        b1 = b1;
                        i1 -= (int)Test.dFld;
                        Test.fFld = i23;
                        iArr1[i23 + 1][i22] = (int)Test.instanceCount;
                    }
                    i21 = -81;
                    if (b1) continue;
                } while (++i22 < 64);
            }
        } else if (b1) {
            Test.fFld -= Test.instanceCount;
        } else {
            Test.iArrFld[(-5547 >>> 1) % N] -= Test.iFld;
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
//DEBUG  byMeth ->  byMeth mainTest
//DEBUG  dMeth ->  dMeth byMeth mainTest
//DEBUG  iMeth ->  iMeth byMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth byMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}