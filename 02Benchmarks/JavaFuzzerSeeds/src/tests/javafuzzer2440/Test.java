package tests.javafuzzer2440;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 14:38:53 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=14L;
    public static boolean bFld=false;
    public static byte byFld=-108;
    public static volatile float fFld=-16.659F;
    public int iFld1=22642;
    public short sFld=-9937;
    public volatile byte byArrFld[]=new byte[N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i5, boolean b, int i6) {

        double d1=2.22611;
        int i7=14, i8=-155, i9=-5, i10=4, i11=42880, iArr[]=new int[N];

        FuzzerUtils.init(iArr, -7);

        Test.instanceCount -= (long)d1;
        i6 = i5;
        i7 = 1;
        while (++i7 < 282) {
            i6 += -40287;
        }
        if (Test.bFld) {
            i8 = 1;
            do {
                i6 += (int)Test.fFld;
                for (i9 = 1; i9 < 6; i9++) {
                    i6 += (((i9 * i6) + Test.fFld) - i6);
                    iArr[i9 - 1] = i7;
                }
                Test.fFld -= i9;
            } while (++i8 < 269);
        }
        i11 = 1;
        while (++i11 < 157) {
            if (Test.bFld) {
                iArr[i11] = -42346;
                iArr[i11 + 1] -= i7;
            } else {
                Test.fFld += (-2L + (i11 * i11));
            }
        }
        vMeth2_check_sum += i5 + (b ? 1 : 0) + i6 + Double.doubleToLongBits(d1) + i7 + i8 + i9 + i10 + i11 +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(long l1, long l2, double d) {

        int i2=-126, i3=11, i4=-5, i12=-13, i13=11, i14=10281, i15=-9;
        float f=21.79F;
        long lArr[]=new long[N];
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(lArr, -6319585594198183543L);
        FuzzerUtils.init(bArr, true);

        Test.bFld = (-1903191305L > lArr[(i2 >>> 1) % N]);
        i2 -= (Test.byFld + 2851);
        for (i3 = 16; i3 < 291; i3++) {
            vMeth2(i3, Test.bFld, i2);
            switch ((i3 % 1) + 121) {
            case 121:
                Test.fFld += Test.fFld;
            }
            for (f = 1; f < 6; f++) {
                l2 >>= i12;
                switch ((int)((f % 2) + 88)) {
                case 88:
                    Test.instanceCount += (-8L + (f * f));
                    for (i13 = 1; i13 < 2; ++i13) {
                        i12 *= -8392;
                        i15 *= i15;
                        i12 += (int)f;
                        i4 <<= i14;
                    }
                    break;
                case 89:
                    i2 += -77;
                    break;
                default:
                    bArr[(int)(f + 1)] = Test.bFld;
                }
            }
        }
        vMeth1_check_sum += l1 + l2 + Double.doubleToLongBits(d) + i2 + i3 + i4 + Float.floatToIntBits(f) + i12 + i13 +
            i14 + i15 + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(bArr);
    }

    public static void vMeth(int i, long l, int i1) {

        int i16=225, i17=32462, iArr1[]=new int[N];
        long l3=-187974237L;
        short s=1902;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -2.118F);
        FuzzerUtils.init(iArr1, 201);

        vMeth1(l, Test.instanceCount, 97.62099);
        i >>= i1;
        for (float f1 : fArr) {
            double d2=0.115386;
            i = (int)d2;
            if (Test.bFld) continue;
            i1 *= -41436;
            for (i16 = 1; i16 < 4; ++i16) {
                i *= (int)l3;
                Test.bFld = Test.bFld;
                i1 = i;
                i17 += i16;
                iArr1[i16 - 1] += Test.byFld;
                Test.instanceCount = i17;
                i1 = (int)Test.fFld;
            }
            s ^= (short)i;
        }
        vMeth_check_sum += i + l + i1 + i16 + i17 + l3 + s + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr3) {

        int i18=-14, i19=8, i20=-149, i21=63537, i22=-36954, i23=23158, i24=-17948, i25=-13, iArr2[]=new int[N];
        double d3=-42.129513;

        FuzzerUtils.init(iArr2, -29717);

        vMeth(iFld1, Test.instanceCount, -9);
        i18 = 1;
        while (++i18 < 258) {
            switch ((i18 % 3) + 119) {
            case 119:
                for (i19 = i18; i19 < 97; ++i19) {
                    iFld1 >>= iFld1;
                    iFld1 += (int)-11.121192;
                    Test.instanceCount = -26L;
                    i20 /= (int)1.372F;
                    iArr2 = iArr2;
                    d3 = i18;
                    Test.instanceCount /= (Test.instanceCount | 1);
                    i20 -= iFld1;
                    i20 = i19;
                    iFld1 = 108;
                }
                break;
            case 120:
                for (i21 = 6; i21 < 97; ++i21) {
                    Test.fFld -= i20;
                    switch ((i18 % 2) + 74) {
                    case 74:
                        d3 -= i18;
                        break;
                    case 75:
                        i20 -= (int)Test.fFld;
                        break;
                    }
                    for (i23 = 2; i23 > 1; i23--) {
                        switch (((iFld1 >>> 1) % 4) + 58) {
                        case 58:
                            iFld1 += (((i23 * i21) + i25) - i24);
                            i20 = (int)Test.instanceCount;
                            i24 ^= i25;
                            try {
                                i24 = (i20 / 1272687864);
                                i22 = (i25 % -1612784868);
                                i20 = (30 % i22);
                            } catch (ArithmeticException a_e) {}
                            break;
                        case 59:
                            i25 >>>= iFld1;
                            i25 = (int)Test.instanceCount;
                            break;
                        case 60:
                            i24 += (int)(-3065023780L + (i23 * i23));
                            break;
                        case 61:
                            i24 = sFld;
                            i22 += i22;
                            break;
                        }
                    }
                }
            case 121:
                byArrFld[i18] += (byte)-231;
                break;
            default:
                iArr2 = iArr2;
            }
        }



    }
    public static void main(String[] strArr2) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr2);
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
