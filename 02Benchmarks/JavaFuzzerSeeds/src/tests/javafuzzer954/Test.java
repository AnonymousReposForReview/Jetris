package tests.javafuzzer954;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 12:00:26 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-2293458391L;
    public volatile boolean bFld=false;
    public volatile int iFld=-8668;
    public static volatile float fFld=0.503F;
    public static int iFld1=47;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];
    public short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -112);
        FuzzerUtils.init(Test.lArrFld, 2733677090L);
    }

    public static long byMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i8) {

        int i9=-7, i10=-2, i11=3, i12=0;
        double d2=77.37337;
        boolean b=false;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)-110);

        if (b) {
            i8 *= i8;
            for (i9 = 10; i9 < 328; ++i9) {
                Test.iArrFld[i9] = (int)Test.instanceCount;
                i8 -= i9;
                Test.iArrFld[i9 + 1] -= i10;
                Test.iArrFld[i9] = i8;
                i10 = (int)d2;
                i8 -= i8;
                for (i11 = 1; 5 > i11; i11++) {
                    byArr[i11 + 1] += (byte)i12;
                    i8 = -156;
                    Test.instanceCount += (i11 - Test.fFld);
                    Test.instanceCount = Test.instanceCount;
                }
                i8 = i11;
            }
        } else {
            i8 <<= (int)Test.instanceCount;
        }
        long meth_res = i8 + i9 + i10 + Double.doubleToLongBits(d2) + i11 + i12 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(byArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(long l, long l1) {

        int i4=124, i5=-11, i6=-55557, i7=-245;
        double d=0.68046, d1=0.41252;
        short s=15600;
        float f=-8.654F;

        for (i4 = 2; i4 < 239; i4++) {
            d = 1;
            do {
                i5 = (int)(((i5--) + (i5--)) - ((s - i4) * (l - d)));
                for (i6 = 1; i6 < 1; ++i6) {
                    f *= (float)(d1++);
                    i7 -= (i5--);
                    iMeth1(i7);
                    Test.fFld -= Test.iFld1;
                    i5 -= i7;
                    l1 -= i5;
                    try {
                        Test.iFld1 = (i7 % -181);
                        i5 = (-65124 % Test.iFld1);
                        Test.iArrFld[i6 + 1] = (i5 / i7);
                    } catch (ArithmeticException a_e) {}
                    Test.lArrFld[i6 + 1] &= 2;
                    i7 += (i6 * i6);
                    i5 += (((i6 * Test.instanceCount) + i6) - f);
                }
                i7 >>= i4;
            } while (++d < 7);
        }
        long meth_res = l + l1 + i4 + i5 + Double.doubleToLongBits(d) + s + i6 + i7 + Float.floatToIntBits(f) +
            Double.doubleToLongBits(d1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static byte byMeth(int i) {

        int i1=-252, i2=2, i3=-36685, i13=60889, i14=-26304, i15=-16713, i16=-160, i17=-71, i18=4, i19=84;
        byte by=70;
        boolean b1=true, bArr[]=new boolean[N];
        double d3=0.25520;

        FuzzerUtils.init(bArr, false);

        i1 = 1;
        do {
            Test.iArrFld[i1 - 1] += (++i);
            for (i2 = 1; i2 < 8; ++i2) {
                by += (byte)(Test.instanceCount / (iMeth(Test.instanceCount, Test.instanceCount) | 1));
                Test.fFld = Test.instanceCount;
                for (i13 = 1; 2 > i13; i13++) {
                    i3 += (int)Test.fFld;
                }
                bArr[i1 - 1] = true;
            }
            b1 = b1;
            Test.iFld1 = i15;
        } while (++i1 < 195);
        for (i16 = 4; i16 < 167; ++i16) {
            for (i18 = 10; i18 > 1; i18 -= 2) {
                i15 += (i18 * i18);
                i19 = (int)d3;
                Test.instanceCount += i;
            }
        }
        long meth_res = i + i1 + i2 + i3 + by + i13 + i14 + (b1 ? 1 : 0) + i15 + i16 + i17 + i18 + i19 +
            Double.doubleToLongBits(d3) + FuzzerUtils.checkSum(bArr);
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i20=-195, i21=-29052, i22=14, i23=-64837, i24=-46, i25=-65041, i26=9, i27=-5, iArr[]=new int[N];
        long l3=-2201767930L;
        byte by1=-24;
        short s2=-13051;

        FuzzerUtils.init(iArr, 14);

        bFld = bFld;
        iFld |= iArr[(iFld >>> 1) % N];
        iFld = (byMeth(iFld) << iFld);
        i20 = 1;
        do {
            if (bFld) break;
            iFld |= iFld;
            Test.instanceCount = i20;
            Test.iFld1 += (i20 | iFld);
            for (i21 = 8; i21 < 140; ++i21) {
                iFld -= i20;
            }
            if (bFld) break;
            l3 = l3;
            by1 >>>= (byte)-4;
        } while (++i20 < 179);
        Test.lArrFld[(i20 >>> 1) % N] = -32705;
        for (i23 = 317; i23 > 7; i23--) {
            if (bFld) continue;
            if (true) break;
            i25 = 1;
            while (++i25 < 81) {
                i26 = 1;
                do {
                    l3 += Test.instanceCount;
                    i22 = Test.iFld1;
                } while (++i26 < 1);
                Test.iFld1 = (int)l3;
                i27 = 1;
                while (++i27 < 1) {
                    if (bFld) continue;
                    i24 *= i21;
                    by1 += (byte)(((i27 * i21) + i26) - by1);
                    Test.iFld1 += (((i27 * i20) + i23) - i27);
                    if (bFld) break;
                }
                i22 += (int)l3;
            }
            s2 >>= by1;
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
//DEBUG  iMeth ->  iMeth byMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth byMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
