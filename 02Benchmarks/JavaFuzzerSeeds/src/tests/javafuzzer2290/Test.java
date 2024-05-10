package tests.javafuzzer2290;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 11:34:26 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-17967779402756977L;
    public static volatile byte byFld=-95;
    public float fFld=-74.1011F;
    public double dFld=0.67393;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -165);
    }

    public static long vMeth_check_sum = 0;
    public static long byMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;

    public static double dMeth() {

        int i10=-60598, i11=-210, i12=-11, i13=-3, i14=12;
        short s1=4332;
        boolean b=false, bArr[]=new boolean[N];
        byte by=55;
        float fArr[]=new float[N];

        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(fArr, -2.426F);

        for (i10 = 1; i10 < 134; i10 += 2) {
            i12 = 1;
            while (++i12 < 23) {
                i11 = i12;
                bArr[i10 + 1] = true;
                s1 += (short)-105.86367;
            }
            if (b) continue;
            for (i13 = 1; i13 < 23; i13++) {
                double d=-125.36789;
                i14 += i13;
                Test.instanceCount <<= i13;
                switch ((i13 % 1) + 28) {
                case 28:
                    Test.iArrFld[i13] = by;
                    i14 += (int)d;
                    Test.iArrFld[i13 - 1] |= 51;
                    i14 >>= -104;
                    break;
                default:
                    i14 = i13;
                }
            }
        }
        long meth_res = i10 + i11 + i12 + s1 + (b ? 1 : 0) + i13 + i14 + by + FuzzerUtils.checkSum(bArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static byte byMeth(int i7) {

        float f=2.231F;
        int i8=-238, i9=-35919, i15=-802, i16=27;
        double d1=-101.80556;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -780977611L);

        for (f = 6; f < 244; f++) {
            switch ((int)((f % 10) + 9)) {
            case 9:
                i9 = 1;
                while (++i9 < 7) {
                    i7 = (int)(Math.abs(f) + dMeth());
                    Test.instanceCount = i8;
                    i7 -= i7;
                    Test.iArrFld = Test.iArrFld;
                    for (i15 = i9; i15 < 1; ++i15) {
                        i16 -= -13823;
                        i16 = i7;
                        i8 += i16;
                        Test.instanceCount *= i9;
                        Test.instanceCount = i9;
                        Test.instanceCount = 0;
                        i16 += i15;
                    }
                }
                break;
            case 10:
                i16 += (int)((long)f | Test.instanceCount);
                break;
            case 11:
                Test.iArrFld[(int)(f - 1)] <<= (int)Test.instanceCount;
                break;
            case 12:
                lArr[(int)(f)] = i9;
                break;
            case 13:
                d1 *= i7;
                break;
            case 14:
                Test.instanceCount ^= Test.instanceCount;
                break;
            case 15:
                Test.instanceCount += (long)f;
            case 16:
                i16 += (-14 + (f * f));
            case 17:
            case 18:
                Test.instanceCount = i7;
                break;
            }
        }
        long meth_res = i7 + Float.floatToIntBits(f) + i8 + i9 + i15 + i16 + Double.doubleToLongBits(d1) +
            FuzzerUtils.checkSum(lArr);
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public static void vMeth(int i3, int i4, short s) {

        int i5=11, i6=13, i17=99, i18=3;
        boolean b1=true;
        float fArr1[]=new float[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(fArr1, -91.761F);
        FuzzerUtils.init(lArr1, 2002641202712584431L);

        for (i5 = 383; i5 > 10; i5 -= 3) {
            Test.instanceCount = (Test.iArrFld[i5 - 1] - (--Test.instanceCount));
        }
        i6 = (byMeth(i3) - 8);
        Test.iArrFld = Test.iArrFld;
        for (i17 = 223; i17 > 4; i17--) {
            switch ((i17 % 5) + 125) {
            case 125:
                try {
                    Test.iArrFld[i17 - 1] = (-24 % i17);
                    i6 = (i3 % i3);
                    i4 = (-855147884 % i3);
                } catch (ArithmeticException a_e) {}
                fArr1[i17 - 1] -= i6;
                Test.instanceCount |= s;
                lArr1[i17] *= Test.instanceCount;
                break;
            case 126:
            case 127:
                i6 = (int)5270816050738943553L;
                if (true) {
                    i18 += i3;
                    i3 = (int)-96.67071;
                } else if (true) {
                    Test.instanceCount += i6;
                } else if (b1) {
                    i3 += i17;
                } else {
                    i3 = i6;
                }
                break;
            case 128:
                i18 ^= i17;
            case 129:
                s ^= Test.byFld;
                break;
            default:
                i4 *= i5;
            }
        }
        vMeth_check_sum += i3 + i4 + s + i5 + i6 + i17 + i18 + (b1 ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + FuzzerUtils.checkSum(lArr1);
    }

    public void mainTest(String[] strArr1) {

        int i=-42, i1=0, i19=-14, i20=7, i21=-54, i22=7, i23=8146, i24=-51, i25=21220, i26=-10799, iArr[]=new int[N];
        short s3=-1321;
        boolean b2=true;
        long lArr2[]=new long[N];

        FuzzerUtils.init(iArr, -206);
        FuzzerUtils.init(lArr2, 20548L);

        for (i = 11; i < 290; ++i) {
            short s2=-25467;
            vMeth(i1, i, s2);
        }
        for (i19 = 256; i19 > 13; i19--) {
            i20 >>= i1;
        }
        for (i21 = 252; i21 > 9; i21--) {
            Test.instanceCount += Test.instanceCount;
            for (i23 = 3; i23 < 103; i23++) {
                iArr[i21] >>= i21;
                for (i25 = 1; i25 < 2; i25++) {
                    switch ((((-9 >>> 1) % 7) * 5) + 51) {
                    case 85:
                        i26 += (((i25 * Test.instanceCount) + i) - s3);
                        iArr[i21] -= (int)fFld;
                        switch ((i25 % 8) + 40) {
                        case 40:
                            i24 *= (int)Test.instanceCount;
                            i1 = i20;
                            break;
                        case 41:
                            dFld = Test.instanceCount;
                            iArr[i21] >>= 0;
                            break;
                        case 42:
                            if (b2) break;
                            lArr2[i23 - 1] >>= i;
                            try {
                                i24 = (i19 % i24);
                                i22 = (i20 % i26);
                                i24 = (i22 / 50973);
                            } catch (ArithmeticException a_e) {}
                        case 43:
                            i22 += i22;
                        case 44:
                            s3 = (short)i20;
                            break;
                        case 45:
                            fFld += (((i25 * Test.instanceCount) + Test.instanceCount) - i20);
                            break;
                        case 46:
                            iArr[i21 - 1] = (int)fFld;
                            i24 += i;
                            b2 = false;
                            iArr[i21] *= (int)Test.instanceCount;
                            break;
                        case 47:
                            Test.instanceCount = Test.instanceCount;
                            fFld = i20;
                            break;
                        }
                        break;
                    case 62:
                        i24 *= i20;
                        break;
                    case 70:
                        Test.iArrFld[i23] = i20;
                    case 63:
                        Test.instanceCount += (i25 * i);
                    case 71:
                        i24 += (i25 | Test.instanceCount);
                    case 73:
                        Test.instanceCount += i19;
                        break;
                    case 77:
                        i26 += -207;
                    default:
                        i20 <<= i;
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
//DEBUG  byMeth ->  byMeth vMeth mainTest
//DEBUG  dMeth ->  dMeth byMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
