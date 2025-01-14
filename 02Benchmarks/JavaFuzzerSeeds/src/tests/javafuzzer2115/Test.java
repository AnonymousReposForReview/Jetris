package tests.javafuzzer2115;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 09:09:55 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=4271570003L;
    public static boolean bFld=false;
    public byte byFld=-12;
    public long lFld=-12L;
    public static long lArrFld[]=new long[N];
    public static byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -2486965027L);
        FuzzerUtils.init(Test.byArrFld, (byte)19);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i4) {

        byte by1=89;
        int i5=-19787, i6=-6, i7=-3, i8=50687, i9=28342, i10=-166, iArr[]=new int[N];
        boolean b=false;
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr, 5);
        FuzzerUtils.init(fArr, -2.276F);

        iArr[(i4 >>> 1) % N] >>= by1;
        Test.instanceCount -= -1;
        fArr[(i4 >>> 1) % N] += by1;
        for (i5 = 2; i5 < 240; i5++) {
            i6 += i6;
            i6 >>= i6;
            Test.instanceCount = by1;
            if (b) {
                for (i7 = 1; i7 < 7; i7++) {
                    i4 /= (int)(Test.instanceCount | 1);
                }
                i8 = (int)Test.instanceCount;
            } else if (b) {
                for (i9 = 1; i9 < 7; i9++) {
                    i4 -= i4;
                    i4 >>= -226;
                    if (b) break;
                }
            } else {
                i4 += i5;
            }
        }
        vMeth1_check_sum += i4 + by1 + i5 + i6 + i7 + i8 + i9 + i10 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth() {

        int i11=37867, i12=1, i13=7;
        double d1=-1.57155;
        short s=-14546;
        byte byArr[]=new byte[N];
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(byArr, (byte)12);
        FuzzerUtils.init(bArr, true);

        vMeth1(-59251);
        Test.instanceCount *= Test.instanceCount;
        i11 *= i11;
        i11 &= (int)Test.instanceCount;
        d1 += i11;
        for (long l1 : Test.lArrFld) {
            i11 >>= i11;
            s = (short)i11;
            i11 += i11;
            if (false) continue;
        }
        bArr[(185 >>> 1) % N] = Test.bFld;
        for (i12 = 10; 313 > i12; ++i12) {
            d1 = d1;
            d1 -= 5L;
            i13 = i11;
        }
        vMeth_check_sum += i11 + Double.doubleToLongBits(d1) + s + i12 + i13 + FuzzerUtils.checkSum(byArr) +
            FuzzerUtils.checkSum(bArr);
    }

    public static int iMeth(int i3, byte by, long l) {

        int i14=52697, i15=-22586, i16=-15064, i17=-49586, i18=32041, iArr1[]=new int[N];
        float f=-116.212F, f1=0.82F;

        FuzzerUtils.init(iArr1, -142);

        vMeth();
        for (i14 = 2; i14 < 147; ++i14) {
            Test.bFld = Test.bFld;
            f %= (i14 | 1);
            f += (i14 - f);
            for (i16 = 1; i16 < 11; ++i16) {
                i15 -= 45496;
                i18 = 1;
                do {
                    Test.bFld = Test.bFld;
                } while (++i18 < 2);
                switch ((i16 % 10) + 103) {
                case 103:
                case 104:
                    f1 *= -23709L;
                    i15 &= i15;
                    break;
                case 105:
                    i17 += i16;
                    iArr1[i16 - 1] += i15;
                    break;
                case 106:
                    Test.byArrFld[i14] *= (byte)i18;
                    break;
                case 107:
                case 108:
                    iArr1[i16 + 1] += (int)Test.instanceCount;
                case 109:
                    i3 -= 12;
                    break;
                case 110:
                    if (Test.bFld) continue;
                    break;
                case 111:
                    i15 &= i14;
                case 112:
                    Test.bFld = Test.bFld;
                default:
                    f += i17;
                }
            }
        }
        long meth_res = i3 + by + l + i14 + i15 + Float.floatToIntBits(f) + i16 + i17 + i18 + Float.floatToIntBits(f1)
            + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=189, i1=48487, i2=-1, i19=12, i20=-2, i21=9, i22=-29672, iArr2[]=new int[N];
        double d=1.108045;
        float f2=12.233F;
        short s1=11053;

        FuzzerUtils.init(iArr2, 2);

        Test.instanceCount = (++i);
        for (i1 = 353; i1 > 1; i1--) {
            Test.instanceCount += (i2++);
            i2 = i1;
            Test.instanceCount += (long)(((d + d) - Math.abs(d)) - Math.max((int)(1 * (Test.instanceCount--)), i2 +
                i2));
            i = Integer.reverseBytes(iMeth(i, byFld, Test.instanceCount));
            i2 += (i1 * i1);
            i += i1;
            byFld += (byte)f2;
        }
        Test.instanceCount = i2;
        i19 = 1;
        while (++i19 < 178) {
            i20 = 1;
            do {
                for (i21 = i19; i21 < 1; ++i21) {
                    i2 -= (int)-1.93380;
                    Test.instanceCount = i20;
                    Test.instanceCount += (((i21 * s1) + i22) - i20);
                    f2 += Test.instanceCount;
                    switch (((i19 >>> 1) % 3) + 89) {
                    case 89:
                        i = (int)1.655F;
                        break;
                    case 90:
                        i22 += (int)Test.instanceCount;
                        if (false) break;
                        i22 -= i22;
                        Test.instanceCount -= i2;
                    case 91:
                        lFld %= -7943680908190749518L;
                        f2 += i21;
                        Test.instanceCount += i22;
                        switch (((i19 % 1) * 5) + 126) {
                        case 130:
                            i22 %= (int)(i19 | 1);
                            try {
                                i22 = (41661 / i20);
                                i22 = (i % i21);
                                iArr2[i21 - 1] = (3928 % iArr2[i19]);
                            } catch (ArithmeticException a_e) {}
                            i22 += (i21 + i20);
                            break;
                        }
                        break;
                    }
                }
            } while (++i20 < 141);
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
