package tests.javafuzzer323;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 01:50:00 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=5257210593022634524L;
    public static short sFld=-22409;

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l, int i2) {

        int i3=27859, i4=-53392, i5=119, i6=137, i7=-213, i8=237, iArr[]=new int[N];
        byte by=-125;
        float f2=-1.988F;
        double dArr[]=new double[N];

        FuzzerUtils.init(iArr, 0);
        FuzzerUtils.init(dArr, -66.29999);

        i2 -= i2;
        i2 -= i2;
        for (i3 = 21; i3 < 379; i3++) {
            i4 *= (int)2948290857L;
            i2 = i4;
            by = (byte)i3;
            iArr[i3 - 1] = i4;
        }
        for (i5 = 3; i5 < 292; i5++) {
            f2 -= i4;
            for (i7 = i5; i7 < 6; i7++) {
                dArr[i7 - 1] -= i2;
                i6 >>= -10;
                i6 *= 72;
            }
            iArr[i5] += i5;
            Test.instanceCount |= i4;
        }
        vMeth1_check_sum += l + i2 + i3 + i4 + by + i5 + i6 + Float.floatToIntBits(f2) + i7 + i8 +
            FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static int iMeth(float f, double d, float f1) {

        boolean b=false, bArr[]=new boolean[N];
        int i1=254, i9=162, i10=14325, i11=-25069, i12=-54584, i13=3, iArr1[]=new int[N];
        byte by1=13;
        float f3=0.252F;
        double dArr1[]=new double[N];

        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(iArr1, -57977);
        FuzzerUtils.init(dArr1, -1.61893);

        b = ((bArr[(-14 >>> 1) % N] = (i1 >= 4)) && b);
        i1 >>= (int)((Test.instanceCount += i1) * (i1--));
        vMeth1(Test.instanceCount, i1);
        if (b) {
            Test.instanceCount |= by1;
        } else if (b) {
            i1 = (int)Test.instanceCount;
            for (i9 = 6; i9 < 302; i9++) {
                i10 = i10;
                for (i11 = 1; i11 < 6; i11++) {
                    i13 = 1;
                    do {
                        iArr1[i11 + 1] = i12;
                        f3 *= Test.instanceCount;
                        iArr1[i13] -= (int)Test.instanceCount;
                        Test.sFld = (short)i9;
                        by1 += (byte)i13;
                    } while (++i13 < 2);
                }
            }
        } else {
            dArr1[(i13 >>> 1) % N] = Test.instanceCount;
        }
        long meth_res = Float.floatToIntBits(f) + Double.doubleToLongBits(d) + Float.floatToIntBits(f1) + (b ? 1 : 0) +
            i1 + by1 + i9 + i10 + i11 + i12 + i13 + Float.floatToIntBits(f3) + FuzzerUtils.checkSum(bArr) +
            FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i) {

        short s=-6650;
        float f4=1.471F, fArr[]=new float[N];
        double d1=1.2215, dArr2[]=new double[N];
        int i14=-227, iArr2[]=new int[N];
        boolean b1=false;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr2, 60);
        FuzzerUtils.init(lArr, 203L);
        FuzzerUtils.init(fArr, -71.903F);
        FuzzerUtils.init(dArr2, -1.86876);

        s <<= (short)(i + iMeth(f4, d1, f4));
        iArr2[(i >>> 1) % N] -= (int)Test.instanceCount;
        i = -10;
        i = (int)25132L;
        i14 = 368;
        while ((i14 -= 2) > 0) {
            Test.instanceCount += (i14 - i14);
            if (b1) continue;
            lArr = lArr;
            switch (((i14 % 8) * 5) + 59) {
            case 64:
                iArr2[i14] += s;
                switch ((i14 % 4) + 65) {
                case 65:
                    i -= (int)f4;
                    b1 = false;
                    break;
                case 66:
                    i += i14;
                    fArr[i14 - 1] = i14;
                    break;
                case 67:
                    f4 += Test.instanceCount;
                    break;
                case 68:
                    s = (short)i14;
                    break;
                }
                break;
            case 84:
                f4 -= i;
                break;
            case 96:
                iArr2[i14] -= i14;
                break;
            case 82:
                d1 = i;
                break;
            case 88:
                lArr[i14 + 1] >>= i14;
            case 75:
            case 71:
                i = i;
                break;
            case 81:
                i += (int)d1;
                break;
            default:
                dArr2[i14 - 1] = i14;
            }
        }
        vMeth_check_sum += i + s + Float.floatToIntBits(f4) + Double.doubleToLongBits(d1) + i14 + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr2));
    }

    public void mainTest(String[] strArr1) {

        int i15=4, i16=-10, i17=-108, i18=3864, i19=239, i20=-3600, i21=-8, i22=13, i23=6, i24=-210, iArr3[]=new int[N];
        double d2=2.93984, dArr3[]=new double[N];
        float f5=-53.735F;
        boolean b2=true;
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr3, -42469);
        FuzzerUtils.init(lArr1, -2672355792201956951L);
        FuzzerUtils.init(dArr3, 116.102514);

        vMeth(i15);
        i15 = (int)2.473F;
        for (i16 = 5; i16 < 263; ++i16) {
            for (i18 = 6; i18 < 97; ++i18) {
                iArr3[i16 - 1] = (int)d2;
                for (i20 = 1; i20 < 2; i20++) {
                    switch (((i18 % 2) * 5) + 82) {
                    case 87:
                        lArr1[i18 + 1] = (long)-86.92750;
                        i15 *= 121;
                        f5 = i16;
                        break;
                    case 84:
                        f5 += (((i20 * i17) + Test.sFld) - i19);
                        break;
                    default:
                        i17 += (i20 * i17);
                        f5 = Test.instanceCount;
                        i17 -= i15;
                        i15 -= (int)d2;
                    }
                    dArr3[i16] += i21;
                }
                Test.instanceCount += (i18 + i18);
            }
            for (i22 = 6; i22 < 97; ++i22) {
                i17 += i15;
                Test.instanceCount -= i15;
                i24 = 1;
                while (++i24 < 2) {
                    i19 = i24;
                    i21 *= (int)f5;
                    Test.instanceCount += (long)d2;
                    i19 += i19;
                }
                iArr3[i22 - 1] = i24;
                i19 >>= -1923;
                i15 = 49444;
                i15 ^= i22;
                if (b2) break;
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
