package tests.javafuzzer617;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 06:40:28 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=3272728L;
    public static byte byFld=-105;
    public volatile float fFld=-2.392F;

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(int i8) {


        i8 = i8;
        i8 -= i8;
        i8 = 31398;
        long meth_res = i8;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static int iMeth(long l1, int i4, int i5) {

        int i6=-2, i7=0, i9=-58, i10=-11, i11=-55, iArr[]=new int[N];
        float f=-2.33F;
        short s=-8674;
        boolean b=true;
        double d=0.130143;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, -415231294L);
        FuzzerUtils.init(iArr, 129);

        for (i6 = 4; i6 < 285; i6++) {
            if (i5 != 0) {
            }
            if (b) {
                i4 += (i6 * f);
                lArr[i6 - 1][i6] = ((s = (short)(0 + (i7 + i4))) / ((i7 - Integer.reverseBytes(i6)) | 1));
            } else {
                iArr[i6 - 1] -= (int)lMeth(i4);
                for (i9 = 1; i9 < 6; ++i9) {
                    i11 = 1;
                    while (++i11 < 2) {
                        i7 &= -13;
                        switch ((i9 % 6) + 124) {
                        case 124:
                            try {
                                i4 = (i11 % 52898);
                                i4 = (i7 / i4);
                                i4 = (-45 / i11);
                            } catch (ArithmeticException a_e) {}
                            i5 >>= -28089;
                            i7 += (i11 * i11);
                            d -= -29354;
                            break;
                        case 125:
                            d = d;
                        case 126:
                            Test.byFld = (byte)Test.instanceCount;
                        case 127:
                            try {
                                i5 = (i11 / 101);
                                i7 = (-206 % i11);
                                i4 = (i9 / -44723);
                            } catch (ArithmeticException a_e) {}
                            break;
                        case 128:
                            s = (short)l1;
                        case 129:
                            i10 = (int)Test.instanceCount;
                            break;
                        default:
                            i7 = (int)f;
                        }
                    }
                }
            }
        }
        long meth_res = l1 + i4 + i5 + i6 + i7 + Float.floatToIntBits(f) + s + (b ? 1 : 0) + i9 + i10 + i11 +
            Double.doubleToLongBits(d) + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(long l, int i2, int i3) {

        int i12=-9409, i13=-167, i14=24500, iArr1[]=new int[N];
        boolean b1=false;
        double d1=11.31578;
        float f1=0.841F;

        FuzzerUtils.init(iArr1, -49506);

        iMeth(Test.instanceCount, i3, i3);
        for (i12 = 4; i12 < 138; i12++) {
            i14 = 1;
            do {
                b1 = b1;
                i2 <<= i14;
                d1 = i12;
                l >>= i13;
                if (b1) {
                    Test.byFld += (byte)i14;
                    d1 -= i2;
                    i13 += i14;
                } else if (b1) {
                    f1 = Test.byFld;
                    iArr1[i12 + 1] /= (int)((long)(d1) | 1);
                    i3 = i14;
                }
                i13 += -9252;
            } while (++i14 < 12);
        }
        vMeth_check_sum += l + i2 + i3 + i12 + i13 + i14 + (b1 ? 1 : 0) + Double.doubleToLongBits(d1) +
            Float.floatToIntBits(f1) + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i=13, i1=9, i15=3833, i16=12, i17=8, i18=116, i19=0, iArr2[]=new int[N];
        boolean b2=true;
        float f2=-40.74F;
        double d2=24.113108;

        FuzzerUtils.init(iArr2, -7439);

        for (i = 3; i < 345; i++) {
            vMeth(Test.instanceCount, 87, i1);
            i1 += (i * i);
            b2 = b2;
            i1 -= i;
            if (b2) {
                Test.byFld += (byte)i;
            }
            i1 = (int)Test.instanceCount;
        }
        f2 = 1;
        do {
            for (i15 = 2; i15 < 191; i15 += 2) {
                for (d2 = 1; d2 < 3; ++d2) {
                    b2 = true;
                    iArr2 = iArr2;
                    b2 = b2;
                    i17 += i15;
                    fFld = Test.instanceCount;
                    i1 -= (int)f2;
                }
                fFld = i;
                try {
                    i17 = (i17 / i1);
                    iArr2[i15 + 1] = (-54217 / i15);
                    i16 = (iArr2[i15] % i);
                } catch (ArithmeticException a_e) {}
                switch ((((i1 >>> 1) % 10) * 5) + 39) {
                case 70:
                    i16 %= (int)(Test.instanceCount | 1);
                    break;
                case 84:
                    i16 -= (int)fFld;
                    break;
                case 71:
                    i17 -= -61677;
                    for (i18 = 1; i18 < 3; i18++) {
                        i1 += (46890 + (i18 * i18));
                        i17 *= (int)Test.instanceCount;
                        i17 += Test.byFld;
                        if (b2) continue;
                    }
                    fFld += (((i15 * Test.instanceCount) + i) - i16);
                    i19 = i18;
                    break;
                case 64:
                    i1 -= 37052;
                    break;
                case 57:
                    Test.instanceCount = Test.instanceCount;
                    break;
                case 42:
                    try {
                        i16 = (iArr2[i15 - 1] % i19);
                        iArr2[(11 >>> 1) % N] = (36478 % i1);
                        i1 = (i17 / -215);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 41:
                    i17 += (((i15 * i1) + i1) - fFld);
                    break;
                case 65:
                    Test.instanceCount = (long)fFld;
                case 63:
                    i16 *= i16;
                    break;
                case 43:
                    i17 = i16;
                }
            }
        } while (++f2 < 131);


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
//DEBUG  lMeth ->  lMeth iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
