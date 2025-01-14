package tests.javafuzzer2494;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 15:25:53 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-1586637922L;
    public static short sFld=-27565;
    public long lArrFld[]=new long[N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i4, long l, int i5) {

        short s=-24776;
        float f=-16.296F, f1=-84.794F;
        int i6=-181, i7=-211, i8=14541, iArr1[]=new int[N];

        FuzzerUtils.init(iArr1, -2);

        i5 &= s;
        i5 *= (int)f;
        i5 = s;
        i5 *= (int)f;
        f *= i4;
        l = i5;
        Test.instanceCount = i5;
        for (i6 = 1; i6 < 224; ++i6) {
            i4 |= i4;
            if (false) continue;
            i7 += i5;
            i7 = -14;
            for (f1 = 1; f1 < 7; ++f1) {
                iArr1[i6 - 1] += i7;
            }
            l += (-241 + (i6 * i6));
        }
        vMeth2_check_sum += i4 + l + i5 + s + Float.floatToIntBits(f) + i6 + i7 + Float.floatToIntBits(f1) + i8 +
            FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth1() {

        int i3=-45, i9=12694, i10=44588, i11=-6, i12=-53405, i13=-170, iArr[]=new int[N];
        float f2=-118.819F;
        long lArr1[]=new long[N];
        double dArr[]=new double[N];
        short sArr[]=new short[N];

        FuzzerUtils.init(iArr, -44050);
        FuzzerUtils.init(lArr1, 2371980190937817092L);
        FuzzerUtils.init(dArr, 17.94887);
        FuzzerUtils.init(sArr, (short)19145);

        i3 >>= Math.abs((int)(Test.instanceCount - (iArr[(14423 >>> 1) % N]++)));
        vMeth2(i3, Test.instanceCount, i3);
        Test.instanceCount += i3;
        i3 = i3;
        for (i9 = 10; i9 < 206; i9++) {
            i10 += (((i9 * f2) + i9) - i9);
            i11 = 8;
            do {
                Test.instanceCount = i11;
                switch ((((i11 >>> 1) % 8) * 5) + 24) {
                case 52:
                    i12 = 1;
                    do {
                        double d=-86.68670;
                        f2 -= f2;
                        switch (((i9 >>> 1) % 10) + 111) {
                        case 111:
                            Test.instanceCount *= Test.instanceCount;
                            i3 -= i10;
                            lArr1 = lArr1;
                            break;
                        case 112:
                            dArr[i9 - 1] = f2;
                            break;
                        case 113:
                            Test.instanceCount += (i12 * i12);
                            break;
                        case 114:
                            i10 += (i12 * i12);
                        case 115:
                            iArr[i12 + 1] *= (int)5095275131130549636L;
                            break;
                        case 116:
                            Test.instanceCount += (((i12 * i10) + Test.instanceCount) - f2);
                            break;
                        case 117:
                            i3 -= -12;
                            break;
                        case 118:
                            i10 >>>= i11;
                        case 119:
                            i10 += (((i12 * i3) + i9) - i10);
                        case 120:
                            i3 += (((i12 * i12) + i10) - i11);
                            break;
                        default:
                            d = f2;
                        }
                    } while (++i12 < 3);
                    break;
                case 29:
                    f2 *= -25570;
                    break;
                case 40:
                    if (i9 != 0) {
                        vMeth1_check_sum += i3 + i9 + i10 + Float.floatToIntBits(f2) + i11 + i12 + i13 +
                            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr1) +
                            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(sArr);
                        return;
                    }
                    break;
                case 33:
                    i3 = i12;
                    break;
                case 27:
                    sArr[i9 + 1] -= (short)i11;
                case 44:
                    i13 += (int)Test.instanceCount;
                    break;
                case 61:
                    f2 -= Test.sFld;
                    break;
                case 36:
                    i10 = i13;
                    break;
                }
            } while ((i11 -= 3) > 0);
        }
        vMeth1_check_sum += i3 + i9 + i10 + Float.floatToIntBits(f2) + i11 + i12 + i13 + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(lArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
            FuzzerUtils.checkSum(sArr);
    }

    public static void vMeth() {

        int i=3, i1=-9, i2=99, i14=1, i15=3916, i16=40540, i17=-2, i18=49, i19=112;
        double d1=-127.81974;
        byte by=68;
        boolean b=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -6658256556654553333L);

        i = 1;
        while (++i < 282) {
            for (i1 = i; 6 > i1; i1++) {
                i2 = i2;
            }
            lArr[i + 1] *= ((Test.instanceCount += i2) * (i2--));
            vMeth1();
        }
        for (i14 = 3; i14 < 213; i14++) {
            for (i16 = 1; i16 < 8; ++i16) {
                i2 += i16;
                for (i18 = 1; i18 < 2; ++i18) {
                    i17 += i18;
                    i17 |= (int)Test.instanceCount;
                    d1 += i19;
                    if (i != 0) {
                        vMeth_check_sum += i + i1 + i2 + i14 + i15 + i16 + i17 + i18 + i19 +
                            Double.doubleToLongBits(d1) + by + (b ? 1 : 0) + FuzzerUtils.checkSum(lArr);
                        return;
                    }
                    i19 += (((i18 * Test.instanceCount) + i18) - by);
                    if (b) break;
                }
            }
        }
        vMeth_check_sum += i + i1 + i2 + i14 + i15 + i16 + i17 + i18 + i19 + Double.doubleToLongBits(d1) + by + (b ? 1
            : 0) + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i20=-58, i21=-188, i22=93, i23=-21697, i24=-55846, i26=-64, i27=-164, iArr2[]=new int[N];
        byte by1=-68, byArr[]=new byte[N];
        float f3=2.139F, fArr[]=new float[N];
        double dArr1[]=new double[N];

        FuzzerUtils.init(iArr2, 197);
        FuzzerUtils.init(dArr1, -2.110330);
        FuzzerUtils.init(fArr, -2.456F);
        FuzzerUtils.init(byArr, (byte)-115);

        vMeth();
        i20 = 140;
        while (--i20 > 0) {
            lArrFld[i20 + 1] -= i20;
            by1 >>= (byte)i20;
            for (i21 = 11; i21 < 179; i21++) {
                i22 += i21;
                for (f3 = 2; f3 > i20; --f3) {
                    i23 <<= i22;
                    i23 -= i20;
                    try {
                        i24 = (iArr2[(int)(f3 + 1)] / -11067);
                        iArr2[(int)(f3 - 1)] = (i24 % -42827);
                        i23 = (i21 / 21713);
                    } catch (ArithmeticException a_e) {}
                    i23 += (int)(((f3 * f3) + i23) - i24);
                    i24 = i24;
                    i22 = Test.sFld;
                    switch ((i21 % 1) + 97) {
                    case 97:
                        i24 *= (int)-3317L;
                        break;
                    }
                    i23 -= (int)f3;
                }
                i24 += i21;
                i23 += (i21 ^ i22);
                iArr2[i21 + 1] -= i22;
                dArr1[(i22 >>> 1) % N] = i23;
                i24 = i24;
                i22 += i22;
                i24 = (int)Test.instanceCount;
            }
            Test.instanceCount = -229;
        }
        Test.instanceCount = Test.instanceCount;
        for (float f4 : fArr) {
            i23 = (int)f3;
        }
        for (i26 = 1; 132 > i26; i26++) {
            iArr2[i26] = i24;
            byArr[i26] += (byte)i24;
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
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
