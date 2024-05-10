package tests.javafuzzer2683;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 18:41:35 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-6755530167808271064L;
    public float fFld=-2.419F;
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -2756044763L);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long sMeth_check_sum = 0;

    public static short sMeth(float f) {

        int i8=27961, i9=-3, i10=2851, i11=20221, i12=-10, i13=-2;
        float f1=-2.896F, f2=-2.221F;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 43.101830);

        i8 <<= i8;
        i8 += i8;
        i8 = i8;
        Test.lArrFld = FuzzerUtils.long1array(N, (long)-13L);
        for (i9 = 7; 168 > i9; ++i9) {
            if (false) continue;
            for (i11 = 10; 1 < i11; i11--) {
                i12 -= i8;
                dArr[i11 + 1] = f;
                f1 += i10;
                Test.instanceCount = i8;
                Test.instanceCount += (i11 - i9);
            }
            for (f2 = 1; f2 < 10; ++f2) {
                i13 ^= i8;
                i8 += (int)f1;
            }
        }
        long meth_res = Float.floatToIntBits(f) + i8 + i9 + i10 + i11 + i12 + Float.floatToIntBits(f1) +
            Float.floatToIntBits(f2) + i13 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public static void vMeth(int i3, long l1, long l2) {

        boolean b=false;
        int i4=110, i5=-6, i6=-58060, i7=2, i14=-14, i15=58183, i17=5, iArr[]=new int[N];
        short s=-10350;
        float f3=57.528F;
        byte by=-116;

        FuzzerUtils.init(iArr, 7);

        b = b;
        for (i4 = 8; i4 < 387; ++i4) {
            for (i6 = 1; i6 < 4; i6++) {
                if (i4 != 0) {
                    vMeth_check_sum += i3 + l1 + l2 + (b ? 1 : 0) + i4 + i5 + i6 + i7 + s + Float.floatToIntBits(f3) +
                        i14 + i15 + by + i17 + FuzzerUtils.checkSum(iArr);
                    return;
                }
                s = sMeth(f3);
                for (i14 = 2; i14 > 1; i14 -= 3) {
                    int i16=-38071;
                    i16 = s;
                    i7 += (((i14 * i7) + i3) - i6);
                    i5 -= i6;
                    by += (byte)i14;
                    if (b) break;
                    l2 ^= i6;
                    iArr[i14 - 1] = i14;
                }
                try {
                    i7 = (-111 / i6);
                    i7 = (i15 % i6);
                    i17 = (i6 / i7);
                } catch (ArithmeticException a_e) {}
                iArr = iArr;
            }
        }
        vMeth_check_sum += i3 + l1 + l2 + (b ? 1 : 0) + i4 + i5 + i6 + i7 + s + Float.floatToIntBits(f3) + i14 + i15 +
            by + i17 + FuzzerUtils.checkSum(iArr);
    }

    public int iMeth(long l, int i1, int i2) {

        int i18=204, i19=6, i20=-4, i21=169;
        double d=92.23566;
        byte by1=66;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 1.699F);

        i2 = (int)fFld;
        vMeth(i1, l, l);
        i1 |= -4;
        fArr[(i2 >>> 1) % N] = i1;
        fFld %= (i1 | 1);
        i1 >>>= (int)l;
        for (i18 = 1; i18 < 207; i18++) {
            for (i20 = 1; i20 < 8; i20++) {
                short s1=-17680;
                Test.instanceCount -= i21;
                i2 += i20;
                d += -53709;
                switch ((i18 % 8) + 36) {
                case 36:
                    i21 = (int)fFld;
                    i2 = 172;
                    i1 = i20;
                    break;
                case 37:
                    i21 = s1;
                    break;
                case 38:
                    Test.instanceCount *= 202;
                    break;
                case 39:
                    Test.lArrFld[i20] >>= by1;
                    break;
                case 40:
                    l *= i21;
                    break;
                case 41:
                    fFld -= i1;
                    break;
                case 42:
                    Test.lArrFld = Test.lArrFld;
                    break;
                case 43:
                    Test.instanceCount >>= -1334031577L;
                    break;
                }
            }
        }
        long meth_res = l + i1 + i2 + i18 + i19 + i20 + i21 + Double.doubleToLongBits(d) + by1 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-14, i22=174, i23=-243, i24=-19290, i25=8, i26=2282, i27=-44236, i28=12992, i29=46, iArr1[]=new int[N];
        short s2=24209;
        boolean b1=true;
        double d1=1.55969;

        FuzzerUtils.init(iArr1, 55);

        i = iMeth(12L, i, -43480);
        i >>= -11;
        for (i22 = 9; i22 < 374; i22++) {
            s2 += (short)-28430;
            i += (i22 | i22);
            i23 -= (int)Test.instanceCount;
            for (i24 = i22; i24 < 69; i24++) {
                i23 = 247;
                i23 ^= (int)Test.instanceCount;
                switch (((i24 % 1) * 5) + 12) {
                case 17:
                    Test.instanceCount = s2;
                    break;
                default:
                    for (i26 = 1; i26 < 1; i26++) {
                        fFld = fFld;
                        i23 += i25;
                        if (b1) break;
                        d1 *= i25;
                        Test.lArrFld = Test.lArrFld;
                        i -= i27;
                        b1 = false;
                    }
                }
                Test.instanceCount += (-26569 + (i24 * i24));
                d1 += fFld;
                iArr1[i22 + 1] = i25;
                Test.instanceCount += i24;
                Test.lArrFld[i24] = (long)d1;
                i23 += i24;
                b1 = b1;
            }
        }
        for (i28 = 4; i28 < 134; i28++) {
            Test.lArrFld[i28] = i28;
            i = 7;
        }
        i23 -= i23;


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
//DEBUG  sMeth ->  sMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
