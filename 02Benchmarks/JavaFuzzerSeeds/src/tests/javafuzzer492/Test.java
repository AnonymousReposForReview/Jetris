package tests.javafuzzer492;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 04:40:58 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-49948L;
    public static double dFld=124.19621;
    public static boolean bFld=false;
    public static byte byFld=-99;
    public static short sArrFld[]=new short[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.sArrFld, (short)-29956);
        FuzzerUtils.init(Test.lArrFld, 10L);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i7, int i8, int i9) {

        int i10=-41992, i11=0, i12=12945, i13=-2, iArr1[]=new int[N];
        float f=88.413F;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr1, -47013);
        FuzzerUtils.init(lArr, -46401L);

        for (i10 = 3; i10 < 208; i10++) {
            i9 *= i11;
            i12 = 8;
            while (--i12 > 0) {
                i13 = 1;
                while (++i13 < 1) {
                    Test.dFld -= i10;
                    iArr1[i12 + 1] *= i8;
                    try {
                        i11 = (i13 / -79);
                        i7 = (-133 % i9);
                        iArr1[i12] = (233 % i13);
                    } catch (ArithmeticException a_e) {}
                    f += i8;
                    lArr[i10 + 1] *= -58;
                    if (Test.bFld) break;
                    Test.instanceCount *= Test.byFld;
                    f = i12;
                    if (Test.bFld) {
                        i11 >>= i11;
                        if (Test.bFld) continue;
                    } else if (Test.bFld) {
                        if (i10 != 0) {
                        }
                    }
                }
            }
        }
        long meth_res = i7 + i8 + i9 + i10 + i11 + i12 + i13 + Float.floatToIntBits(f) + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(lArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(double d, long l1, short s) {

        int i3=34825, i4=-118, i5=-5389, i6=171, i14=-7, iArr[]=new int[N];
        float f1=2.404F;
        long lArr1[][]=new long[N][N];

        FuzzerUtils.init(iArr, -7114);
        FuzzerUtils.init(lArr1, 1549652347L);

        for (i3 = 13; i3 < 349; i3++) {
            try {
                i4 = (i3 / i3);
                i4 = (i3 / -18263);
                i4 = (i4 / -1007829750);
            } catch (ArithmeticException a_e) {}
            switch ((((i4 >>> 1) % 2) * 5) + 95) {
            case 100:
                for (i5 = 1; i5 < 5; i5 += 2) {
                    try {
                        iArr[i5 + 1] = (i3 / -50);
                        i4 = (i5 % -936907255);
                        i6 = (14599 / iArr[i5 - 1]);
                    } catch (ArithmeticException a_e) {}
                    i4 = (iMeth1(i5, 224, i3) + s);
                }
                break;
            case 98:
                i6 += (((i3 * i4) + s) - i6);
                break;
            }
            f1 += (i3 * i5);
            i14 = i6;
            i6 = i14;
            i6 += (-181 + (i3 * i3));
            f1 += ((long)i3 ^ (long)i4);
            s = (short)l1;
            i14 -= s;
        }
        lArr1 = FuzzerUtils.long2array(N, (long)-9L);
        vMeth_check_sum += Double.doubleToLongBits(d) + l1 + s + i3 + i4 + i5 + i6 + Float.floatToIntBits(f1) + i14 +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr1);
    }

    public static int iMeth(int i1, int i2) {

        short s1=31848;
        int i15=173, i16=-7, i17=4, iArr2[]=new int[N];
        long l2=-181L, lArr2[]=new long[N];
        float f2=24.911F;

        FuzzerUtils.init(iArr2, -222);
        FuzzerUtils.init(lArr2, 3788558426782161307L);

        vMeth(Test.dFld, Test.instanceCount, s1);
        for (i15 = 6; i15 < 300; ++i15) {
            i2 += i16;
            switch ((((i16 >>> 1) % 1) * 5) + 34) {
            case 38:
                switch ((i15 % 6) + 83) {
                case 83:
                    iArr2[i15] *= (int)Test.dFld;
                    i16 -= i15;
                    break;
                case 84:
                    for (l2 = 1; l2 < 6; ++l2) {
                        i16 -= -7;
                        i2 += i15;
                        i1 += (int)(((l2 * i16) + i15) - f2);
                        i16 += (int)l2;
                    }
                    i16 = (int)-11L;
                    lArr2 = FuzzerUtils.long1array(N, (long)11699L);
                    Test.byFld = (byte)-4;
                    break;
                case 85:
                    Test.dFld -= l2;
                    break;
                case 86:
                    i16 = i1;
                    break;
                case 87:
                    if (i17 != 0) {
                    }
                    break;
                case 88:
                    Test.instanceCount <<= i2;
                    break;
                }
                break;
            default:
                Test.instanceCount -= 2174371544L;
            }
        }
        long meth_res = i1 + i2 + s1 + i15 + i16 + l2 + i17 + Float.floatToIntBits(f2) + FuzzerUtils.checkSum(iArr2) +
            FuzzerUtils.checkSum(lArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        long l=1590017213152485441L;
        int i=-225;
        float f3=-1.514F;

        for (l = 18; 356 > l; ++l) {
            Test.instanceCount = (i / (iMeth(i, 57) | 1));
        }
        Test.sArrFld[(-81 >>> 1) % N] >>= (short)i;
        Test.lArrFld[(i >>> 1) % N] -= (long)f3;
        i = 2;


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
//DEBUG  iMeth1 ->  iMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
