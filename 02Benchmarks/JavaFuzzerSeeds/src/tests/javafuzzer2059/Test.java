package tests.javafuzzer2059;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 08:13:01 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=220068904849119492L;
    public static volatile boolean bFld=false;
    public float fFld=2.997F;
    public static double dFld=1.119123;
    public static int iArrFld[]=new int[N];
    public boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -80);
    }

    public static long vMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(float f1) {

        int i1=-4, i2=-12, i3=-7, i4=-30852, i5=2666, iArr[]=new int[N];
        short s=1181;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 0.40221);
        FuzzerUtils.init(iArr, 7);

        i1 &= i1;
        dArr[(i1 >>> 1) % N] += i1;
        i1 += (int)f1;
        i1 -= i1;
        for (i2 = 7; i2 < 392; i2++) {
            switch ((((i1 >>> 1) % 2) * 5) + 123) {
            case 128:
                iArr[i2 - 1] = i3;
                break;
            case 124:
            default:
                s += (short)(247L + (i2 * i2));
            }
            i3 = i1;
            for (i4 = 1; 4 > i4; ++i4) {
                i1 += (i4 * i4);
                Test.instanceCount &= 65;
                f1 -= Test.instanceCount;
            }
        }
        i1 = (int)-1.97223;
        i1 ^= i4;
        vMeth1_check_sum += Float.floatToIntBits(f1) + i1 + i2 + i3 + s + i4 + i5 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr);
    }

    public static double dMeth() {

        int i=-36387, i6=4, i7=23506, i8=-5;
        float f2=-64.526F, f3=2.996F;

        Test.instanceCount += (long)(Test.instanceCount * ((++Test.instanceCount) +
            Double.longBitsToDouble(-1799284905713222796L)));
        i = 1;
        while (++i < 167) {
            vMeth1(f2);
            Test.instanceCount = i;
            i6 *= i;
            switch (((-28661 >>> 1) % 3) + 45) {
            case 45:
                Test.iArrFld[i] -= i6;
                i6 = i;
                break;
            case 46:
                i7 = 9;
                while ((i7 -= 2) > 0) {
                    for (f3 = 2; f3 > 1; f3 -= 3) {
                        if (Test.bFld) continue;
                        switch (((i7 % 2) * 5) + 77) {
                        case 87:
                            i6 *= i;
                            break;
                        case 83:
                            f2 *= Test.instanceCount;
                            Test.iArrFld[i] *= (int)f2;
                            break;
                        }
                    }
                }
                break;
            case 47:
                i6 -= i7;
                break;
            default:
                i6 = i8;
            }
        }
        long meth_res = i + Float.floatToIntBits(f2) + i6 + i7 + Float.floatToIntBits(f3) + i8;
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static void vMeth(long l, long l1, float f) {

        int i9=-3, i10=13308, i11=-100, i12=-20, i13=-11;
        short s1=-4393;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, true);

        dMeth();
        for (i9 = 14; i9 < 226; ++i9) {
            i10 = i9;
            i10 += (i9 * i9);
            l1 <<= l1;
            i11 = 1;
            while (++i11 < 8) {
                for (i12 = 1; i12 > 1; i12--) {
                    i13 >>= i12;
                    bArr[i12 - 1] = Test.bFld;
                    i10 *= 127;
                    i10 %= (int)(i12 | 1);
                    i13 = i11;
                    i10 += i12;
                }
                i13 *= i9;
                f += (((i11 * s1) + l1) - i12);
            }
        }
        vMeth_check_sum += l + l1 + Float.floatToIntBits(f) + i9 + i10 + i11 + i12 + i13 + s1 +
            FuzzerUtils.checkSum(bArr);
    }

    public void mainTest(String[] strArr1) {

        long l2=0L, lArr[]=new long[N];
        int i14=-53, i15=-20066, i16=83, i17=-130, i18=239, i19=174, i20=17, i21=-3, i22=75, i23=4;
        byte by=-117;
        short s2=21018;

        FuzzerUtils.init(lArr, 0L);

        vMeth(Test.instanceCount, Test.instanceCount, fFld);
        Test.iArrFld = Test.iArrFld;
        for (l2 = 8; l2 < 178; l2++) {
            i14 += (int)l2;
            for (i15 = 7; 148 > i15; i15++) {
                for (i17 = 1; i17 < 2; i17 += 2) {
                    Test.instanceCount = Test.instanceCount;
                    Test.instanceCount >>>= -2937;
                    i18 *= i14;
                    by -= (byte)i14;
                    i14 = (int)l2;
                    i18 = i14;
                    Test.instanceCount -= i18;
                    i18 += (i17 + i14);
                    i16 >>= i17;
                    bArrFld[(4 >>> 1) % N] = false;
                }
                Test.iArrFld[(int)(l2 + 1)] -= i16;
                Test.instanceCount = 10;
                i14 += (((i15 * s2) + Test.instanceCount) - Test.instanceCount);
            }
            i19 = 1;
            while (++i19 < 148) {
                for (i20 = (int)(l2); i20 < 1; ++i20) {
                    i16 = (int)fFld;
                    Test.instanceCount = Test.instanceCount;
                }
                if (Test.bFld) break;
                lArr[i19 - 1] += (long)Test.dFld;
                for (i22 = 1; i22 < 1; ++i22) {
                    i16 -= i21;
                    Test.instanceCount = 1;
                }
                Test.iArrFld = Test.iArrFld;
                by += (byte)i19;
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  dMeth ->  dMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 dMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
