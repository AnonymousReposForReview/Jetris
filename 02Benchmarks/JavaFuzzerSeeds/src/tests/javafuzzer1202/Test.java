package tests.javafuzzer1202;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 16:22:24 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=65477L;
    public static boolean bFld=false;
    public static double dFld=-34.8514;
    public byte byFld=77;
    public static float fFld=6.405F;
    public static short sFld=22693;
    public float fFld1=-78.712F;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(float f1) {

        int i5=71, i6=25377, i7=53, i8=-3, i9=221, iArr1[]=new int[N];
        byte by1=91;

        FuzzerUtils.init(iArr1, 246);

        Test.dFld = i5;
        Test.instanceCount *= i5;
        for (i6 = 19; i6 < 359; i6 += 3) {
            if (Test.bFld) continue;
            for (i8 = 1; i8 < 14; ++i8) {
                i9 = i6;
                iArr1[i8 - 1] |= (int)1446688746075624629L;
                i7 = by1;
                i5 += (((i8 * f1) + i8) - i5);
                if (Test.bFld) continue;
                f1 = Test.instanceCount;
                i5 >>= i9;
                Test.bFld = Test.bFld;
                i9 <<= (int)Test.instanceCount;
            }
            f1 = -2;
        }
        vMeth2_check_sum += Float.floatToIntBits(f1) + i5 + i6 + i7 + i8 + i9 + by1 + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth1() {

        float f2=-54.411F, fArr[]=new float[N];
        int i10=-4, i11=126, i12=-18, i13=-11, i14=219, i15=41, i16=99, i17=96;
        short s=-30715;
        long lArr[]=new long[N];
        boolean bArr[][]=new boolean[N][N];

        FuzzerUtils.init(lArr, -34745L);
        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(fArr, -2.298F);

        vMeth2(f2);
        lArr[(i10 >>> 1) % N] >>>= i10;
        for (i11 = 5; i11 < 192; ++i11) {
            if (Test.bFld) {
                i12 <<= i13;
            } else {
                s += (short)i11;
            }
            if (Test.bFld) {
                if (Test.bFld) {
                    switch (((i11 % 9) * 5) + 108) {
                    case 153:
                        lArr[i11 + 1] *= Test.instanceCount;
                        i12 += i10;
                        for (i14 = 1; i14 < 9; ++i14) {
                            for (i16 = 1; i16 < 2; i16++) {
                                i12 += -48190;
                                i15 -= (int)f2;
                            }
                        }
                        break;
                    case 120:
                        lArr[i11 + 1] = Test.instanceCount;
                        break;
                    case 147:
                        f2 -= -579789969L;
                        break;
                    case 117:
                        i15 -= i13;
                        break;
                    case 125:
                        i10 += i11;
                        break;
                    case 112:
                        Test.instanceCount -= i14;
                        break;
                    case 138:
                        bArr = bArr;
                    case 136:
                        i17 += (-36767 + (i11 * i11));
                        break;
                    case 132:
                        if (i10 != 0) {
                            vMeth1_check_sum += Float.floatToIntBits(f2) + i10 + i11 + i12 + i13 + s + i14 + i15 + i16
                                + i17 + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(bArr) +
                                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                            return;
                        }
                        break;
                    default:
                        i17 += -23378;
                    }
                } else {
                    Test.instanceCount = i14;
                    vMeth1_check_sum += Float.floatToIntBits(f2) + i10 + i11 + i12 + i13 + s + i14 + i15 + i16 + i17 +
                        FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(bArr) +
                        Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                    return;
                }
            } else if (Test.bFld) {
                fArr[i11 + 1] *= 841611135391943172L;
                vMeth1_check_sum += Float.floatToIntBits(f2) + i10 + i11 + i12 + i13 + s + i14 + i15 + i16 + i17 +
                    FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(bArr) +
                    Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                return;
            } else {
                i13 = (int)Test.instanceCount;
            }
        }
        vMeth1_check_sum += Float.floatToIntBits(f2) + i10 + i11 + i12 + i13 + s + i14 + i15 + i16 + i17 +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(bArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth(byte by, int i1) {

        int i2=13257, i3=67, i4=-2, i18=-47672, i19=-11132, i20=-214, iArr[]=new int[N];
        short s1=11429;
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr, -2);
        FuzzerUtils.init(lArr1, -29974L);

        for (i2 = 6; i2 < 235; i2++) {
            i1 += (((i2 * Test.instanceCount) + i2) - Test.instanceCount);
        }
        i3 *= iArr[(i3 >>> 1) % N];
        i4 = 1;
        while (++i4 < 382) {
            vMeth1();
        }
        i1 = (int)Test.instanceCount;
        for (i18 = 284; 17 < i18; i18 -= 2) {
            lArr1[i18 + 1] %= -10953;
            s1 -= (short)-12;
            i20 = 1;
            do {
                float f3=3.512F;
                switch ((i20 % 4) + 76) {
                case 76:
                    Test.instanceCount = (long)Test.dFld;
                    i3 = 43694;
                    break;
                case 77:
                    if (Test.bFld) break;
                    by >>= (byte)i3;
                    break;
                case 78:
                    i19 >>= i4;
                    break;
                case 79:
                    i19 = i1;
                    break;
                default:
                    f3 += -12;
                }
            } while (++i20 < 12);
        }
        vMeth_check_sum += by + i1 + i2 + i3 + i4 + i18 + i19 + s1 + i20 + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(lArr1);
    }

    public void mainTest(String[] strArr1) {

        float f=-65.41F;
        int i=9, i21=-10, i22=-99, i23=-37147, i24=-129, i25=119, i26=-10, iArr2[]=new int[N];
        byte by2=-45;
        long l=-9185582624232922848L, lArr2[]=new long[N];

        FuzzerUtils.init(lArr2, 245L);
        FuzzerUtils.init(iArr2, 12787);

        f = 1;
        while (++f < 125) {
            Test.bFld = (Test.bFld = (Test.bFld | (i <= 39331)));
            vMeth(byFld, 0);
            lArr2[(int)(f)] = by2;
            for (i21 = 9; i21 < 201; ++i21) {
                for (i23 = 1; i23 < 2; i23 += 3) {
                    i24 = (int)Test.instanceCount;
                    i22 <<= (int)Test.instanceCount;
                }
                Test.bFld = Test.bFld;
                Test.dFld += Test.instanceCount;
                Test.fFld = i23;
                for (i25 = 1; i25 < 2; ++i25) {
                    lArr2[i25] += Test.instanceCount;
                    switch (((i21 >>> 1) % 9) + 92) {
                    case 92:
                        i += (i25 * Test.fFld);
                        i22 += (i25 * l);
                        i26 -= i;
                        i24 = i22;
                        break;
                    case 93:
                        switch ((int)(((f % 3) * 5) + 71)) {
                        case 74:
                            iArr2[i21 - 1] *= i21;
                            i = i22;
                            i22 -= (int)f;
                            break;
                        case 83:
                            iArr2[(int)(f)] = (int)51165L;
                            iArr2[i25] -= i21;
                            lArr2[i21] <<= i24;
                            Test.fFld += (((i25 * i21) + Test.sFld) - i);
                        case 76:
                        default:
                            i26 += i23;
                        }
                        i22 += (((i25 * fFld1) + i26) - l);
                        lArr2[i25 - 1] += (long)Test.dFld;
                        break;
                    case 94:
                        i22 += (-94 + (i25 * i25));
                        break;
                    case 95:
                        i *= (int)-49050L;
                        break;
                    case 96:
                        i24 %= 7;
                        break;
                    case 97:
                        i26 += i25;
                        break;
                    case 98:
                        i24 += (int)-34.936F;
                    case 99:
                        i24 *= i21;
                    case 100:
                        i += (((i25 * Test.instanceCount) + Test.fFld) - i23);
                        break;
                    default:
                        Test.instanceCount -= i;
                    }
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}