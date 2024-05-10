package tests.javafuzzer1783;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 03:20:16 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-11L;
    public static float fFld=1.712F;
    public long lArrFld[]=new long[N];
    public static float fArrFld[]=new float[N];
    public static boolean bArrFld[]=new boolean[N];
    public int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.fArrFld, -1.733F);
        FuzzerUtils.init(Test.bArrFld, true);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth(long l, int i10) {

        long l1=-2458816978L, lArr[][]=new long[N][N];
        int i11=150, i12=-36499, i13=-144, i14=4, i15=-25818, iArr2[]=new int[N];
        short s=-2476, s1=-31000;
        boolean b=false;
        byte byArr[][]=new byte[N][N];

        FuzzerUtils.init(lArr, -3218663155154929182L);
        FuzzerUtils.init(byArr, (byte)-111);
        FuzzerUtils.init(iArr2, 0);

        i10 >>>= (int)l;
        for (l1 = 7; 329 > l1; l1++) {
            double d1=58.35437;
            s <<= s1;
            switch ((int)(((l1 % 9) * 5) + 126)) {
            case 162:
                for (i12 = 1; i12 < 5; ++i12) {
                    for (i14 = 1; i14 < 2; ++i14) {
                        i11 -= i15;
                        lArr[(i13 >>> 1) % N][i12] = 0;
                        i11 *= (int)Test.fFld;
                        i11 += i15;
                        Test.fFld = i13;
                    }
                    byArr[(int)(l1)][i12] &= (byte)i10;
                    Test.bArrFld = Test.bArrFld;
                    try {
                        i11 = (-42995 % i15);
                        iArr2[(int)(l1 - 1)] = (iArr2[(int)(l1 + 1)] / iArr2[i12 - 1]);
                        i15 = (i12 / i14);
                    } catch (ArithmeticException a_e) {}
                }
                if (b) break;
                break;
            case 136:
                i13 += (int)l1;
                break;
            case 171:
                i11 += (int)l1;
            case 141:
                i11 >>= i13;
                break;
            case 157:
                i10 -= i15;
                break;
            case 132:
                if (b) break;
                break;
            case 129:
                d1 /= (l | 1);
                break;
            case 156:
                iArr2[(int)(l1 + 1)] += (int)l1;
            case 139:
                b = b;
                break;
            }
        }
        long meth_res = l + i10 + l1 + i11 + s + s1 + i12 + i13 + i14 + i15 + (b ? 1 : 0) + FuzzerUtils.checkSum(lArr)
            + FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(iArr2);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth1(int i7, float f2) {

        int i8=175, i9=4, i17=-249, iArr1[]=new int[N];
        byte by=-99;
        short s2=31217;

        FuzzerUtils.init(iArr1, -28439);

        for (i8 = 15; i8 < 247; i8++) {
            f2 -= (i9 = i9);
            by >>= (byte)iArr1[(15280 >>> 1) % N];
            i9 <<= 8;
            i7 <<= (int)Test.instanceCount;
            i9 = (int)((Math.abs(i8) - (--iArr1[i8])) - ((by * Test.instanceCount) & 116));
            if (i8 != 0) {
                vMeth1_check_sum += i7 + Float.floatToIntBits(f2) + i8 + i9 + by + s2 + i17 +
                    FuzzerUtils.checkSum(iArr1);
                return;
            }
            Test.fArrFld[i8] -= ((long)(fMeth(Test.instanceCount, 0) - i8) >>> s2);
        }
        i9 -= (int)3455224459315442650L;
        Test.fFld = i9;
        i9 >>>= 37928;
        Test.instanceCount = Test.instanceCount;
        i9 -= by;
        i9 >>= i8;
        Test.instanceCount += i17;
        vMeth1_check_sum += i7 + Float.floatToIntBits(f2) + i8 + i9 + by + s2 + i17 + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(double d, float f) {

        int i1=55386, i2=4, i3=13, i4=-35256, i5=-146, i6=5, iArr[]=new int[N], iArr3[]=new int[N];
        float f1=2.662F;
        boolean b1=true;
        long lArr1[]=new long[N];
        double dArr1[]=new double[N];

        FuzzerUtils.init(iArr, 145);
        FuzzerUtils.init(lArr1, 421921787070553336L);
        FuzzerUtils.init(dArr1, 102.68385);
        FuzzerUtils.init(iArr3, 18893);

        f = (float)(((iArr[(i1 >>> 1) % N]++) * (d--)) - i1);
        for (i2 = 19; i2 < 362; i2++) {
            if (i2 != 0) {
                vMeth_check_sum += Double.doubleToLongBits(d) + Float.floatToIntBits(f) + i1 + i2 + i3 +
                    Float.floatToIntBits(f1) + i4 + i5 + i6 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr) +
                    FuzzerUtils.checkSum(lArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)) +
                    FuzzerUtils.checkSum(iArr3);
                return;
            }
            for (f1 = 1; f1 < 5; ++f1) {
                for (i5 = 1; i5 < 2; i5++) {
                    if (b1) {
                        vMeth1(-13, f);
                    }
                    i1 -= (int)d;
                    lArr1[i2 + 1] >>= i5;
                    dArr1[i2] += Test.instanceCount;
                    i3 += (int)Test.instanceCount;
                }
                i3 = 0;
                iArr3[(int)(f1 - 1)] -= i4;
                Test.fFld += (1314 + (f1 * f1));
                Test.fArrFld[i2 + 1] *= Test.instanceCount;
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + Float.floatToIntBits(f) + i1 + i2 + i3 +
            Float.floatToIntBits(f1) + i4 + i5 + i6 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(lArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)) +
            FuzzerUtils.checkSum(iArr3);
    }

    public void mainTest(String[] strArr1) {

        int i=-10, i18=51104, i19=-41135, i20=13, i21=247, i22=-10;
        double d2=68.95519, d3=-3.4718, dArr[]=new double[N];
        float f3=2.310F;
        short s3=25240;
        long l2=-2408L;
        boolean b2=false;

        FuzzerUtils.init(dArr, 2.22817);

        i = i;
        Test.instanceCount *= 2363;
        lArrFld[(i >>> 1) % N] = (long)(dArr[(i >>> 1) % N] + (i |= (int)(Test.instanceCount + Test.instanceCount)));
        vMeth(d2, Test.fFld);
        if (b2) {
            for (f3 = 10; f3 < 192; ++f3) {
                for (d3 = 138; d3 > 2; --d3) {
                    Test.instanceCount += Test.instanceCount;
                    s3 += (short)i;
                    Test.fFld = i18;
                    iArrFld[(int)(d3 - 1)] = (int)864790365L;
                    Test.instanceCount += (long)d3;
                }
                for (l2 = 138; l2 > 8; l2 -= 2) {
                    Test.instanceCount += i19;
                    Test.instanceCount >>= -44197L;
                }
                i21 = 1;
                do {
                    i += (int)-19.71521;
                    i22 = 1;
                    do {
                        Test.fFld = 14;
                        s3 = (short)i18;
                        switch (((i21 >>> 1) % 10) + 18) {
                        case 18:
                            i *= (int)l2;
                            i += i18;
                            break;
                        case 19:
                            if (false) {
                                Test.fFld = i20;
                                if (b2) continue;
                                lArrFld[i21] = i19;
                                i20 += (i22 ^ i22);
                            }
                            break;
                        case 20:
                            iArrFld[(int)(f3)] *= i18;
                            i19 -= (int)f3;
                            break;
                        case 21:
                            if (false) break;
                        case 22:
                            Test.instanceCount += (i22 * i22);
                            break;
                        case 23:
                            i19 += (int)Test.fFld;
                            break;
                        case 24:
                        case 25:
                            i20 += i22;
                            break;
                        case 26:
                            Test.fArrFld[i21 - 1] = i19;
                        case 27:
                            i18 -= (int)d2;
                        default:
                            Test.instanceCount -= i19;
                        }
                    } while (++i22 < 1);
                } while (++i21 < 138);
            }
        } else {
            i = i22;
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
//DEBUG  fMeth ->  fMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
