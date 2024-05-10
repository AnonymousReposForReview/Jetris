package tests.javafuzzer57;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 21:38:17 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-14677L;
    public static int iFld=-172;
    public static volatile double dFld=-1.129608;
    public static byte byFld=80;
    public static float fArrFld[]=new float[N];
    public static short sArrFld[]=new short[N];
    public int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 1.844F);
        FuzzerUtils.init(Test.sArrFld, (short)7242);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i8, byte by, int i9) {

        long l2=8L;
        int i10=-72, i11=-51, i12=-11, i13=8, i14=-6838, i15=-191, i16=0, iArr1[]=new int[N];
        boolean b=false;
        short s2=-1207;

        FuzzerUtils.init(iArr1, 2);

        Test.dFld = Test.iFld;
        for (l2 = 21; l2 < 348; ++l2) {
            i10 *= (int)Test.dFld;
            for (i11 = 1; i11 < 5; ++i11) {
                i10 *= (int)l2;
                iArr1 = iArr1;
                i13 = 1;
                while (++i13 < 2) {
                    i14 += (i13 ^ Test.instanceCount);
                    Test.dFld = i8;
                    Test.instanceCount = i12;
                    b = false;
                }
                Test.iFld ^= i10;
            }
            for (i15 = 1; i15 < 5; i15++) {
                s2 <<= s2;
                Test.iFld >>= (int)l2;
            }
        }
        long meth_res = i8 + by + i9 + l2 + i10 + i11 + i12 + i13 + i14 + (b ? 1 : 0) + i15 + i16 + s2 +
            FuzzerUtils.checkSum(iArr1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(long l1) {

        float f1=0.124F, f2=-115.406F;
        int i6=-1, i7=-5, i17=22307, i18=32, i19=-16008, i20=67, iArr2[]=new int[N];
        byte by1=-105;
        long l3=5L;
        boolean b1=false;

        FuzzerUtils.init(iArr2, -196);

        f1 = (Test.iFld << (long)((Test.dFld + -19) + Test.iFld));
        for (i6 = 10; i6 < 393; i6 += 2) {
            if (b1) {
                i7 += (((i6 * Test.iFld) + i7) - i7);
                Test.iFld -= iMeth1(i6, by1, Test.iFld);
                for (l3 = i6; l3 < 8; ++l3) {
                    Test.instanceCount += (l3 * l3);
                    i7 = (int)Test.dFld;
                    Test.dFld += i18;
                    i18 *= (int)l3;
                    Test.instanceCount <<= -1523444124843928889L;
                }
                for (i19 = 1; i19 < 8; i19++) {
                    f2 = 1;
                    do {
                        i17 = i17;
                        iArr2 = iArr2;
                    } while ((f2 += 3) < 2);
                }
            } else {
                Test.iFld <<= 191;
            }
        }
        vMeth_check_sum += l1 + Float.floatToIntBits(f1) + i6 + i7 + by1 + l3 + i17 + i18 + i19 + i20 +
            Float.floatToIntBits(f2) + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr2);
    }

    public static int iMeth(long l) {

        int i=2, i1=39457, i2=-10, i3=63191, i4=-53175, i5=11, i21=2, i22=-60185, iArr[]=new int[N];
        short s1=19945;
        float f=2.426F;
        boolean b2=false;
        double dArr[]=new double[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -42);
        FuzzerUtils.init(dArr, 17.84589);
        FuzzerUtils.init(lArr, 2502507469773322696L);

        for (i = 8; i < 281; ++i) {
            Test.iFld += (((i * Test.iFld) + s1) - i1);
            for (i2 = 1; i2 < 6; i2++) {
                switch ((i % 9) + 69) {
                case 69:
                    switch (((((i3 + i) >>> 1) % 1) * 5) + 1) {
                    case 4:
                        Test.dFld += (i3 + ((i2 - -95.358F) * (i1--)));
                        try {
                            i1 = (i2 % 12643);
                            i1 = (iArr[i2 - 1] / 36869);
                            i3 = (Test.iFld % -602978524);
                        } catch (ArithmeticException a_e) {}
                        f += ((long)((61567 + (i1 + f)) * (i2 + Test.iFld)) & (-(-46798 * l)));
                        switch (((i2 % 5) * 5) + 50) {
                        case 71:
                            for (i4 = 1; i4 < 2; ++i4) {
                                vMeth(l);
                                i3 >>>= i;
                            }
                            i21 = 22468;
                            l = Test.byFld;
                            break;
                        case 65:
                            Test.instanceCount = l;
                            break;
                        case 56:
                            dArr[i2 + 1] *= i;
                            break;
                        case 60:
                            Test.instanceCount += -35;
                            break;
                        case 58:
                            s1 *= (short)i2;
                            break;
                        }
                        break;
                    default:
                        lArr[i2] -= i;
                    }
                case 70:
                    i5 += (((i2 * l) + f) - i22);
                    break;
                case 71:
                    iArr[i] >>= i21;
                    break;
                case 72:
                case 73:
                    Test.fArrFld[i2] -= i4;
                    break;
                case 74:
                case 75:
                    f += f;
                    break;
                case 76:
                    if (b2) continue;
                    break;
                case 77:
                    Test.sArrFld[i2] = (short)i1;
                    break;
                default:
                    Test.sArrFld[i - 1] = (short)l;
                }
            }
        }
        long meth_res = l + i + i1 + s1 + i2 + i3 + Float.floatToIntBits(f) + i4 + i5 + i21 + i22 + (b2 ? 1 : 0) +
            FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
            FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        short s=-19365;
        int i23=-9, i24=13, i25=22, i26=-45894, i27=-101, i28=87, i29=205, i30=45020, i31=-4, i32=-19, i33=-83, i34=-43;
        long l4=5L;
        float f3=-88.988F;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)-52);

        s -= (short)((--Test.iFld) - (Test.iFld - iMeth(Test.instanceCount)));
        iArrFld[(Test.iFld >>> 1) % N] *= i23;
        for (i24 = 9; 158 > i24; i24++) {
            Test.instanceCount += (((i24 * s) + l4) - Test.instanceCount);
            i25 -= (int)l4;
            for (i26 = 5; i26 < 168; ++i26) {
                i28 = 1;
                do {
                    f3 *= i26;
                    i23 += (i28 * i23);
                    Test.iFld = Test.iFld;
                    i23 += (int)l4;
                    i23 += (int)-26.116601;
                    byArr[i28] = (byte)Test.dFld;
                    i23 += (int)Test.instanceCount;
                    Test.dFld = i23;
                    Test.iFld += (((i28 * i24) + i27) - f3);
                    l4 <<= l4;
                } while (++i28 < 2);
                iArrFld[i24] = 10;
                i23 += (((i26 * i25) + Test.iFld) - l4);
                i27 += (int)f3;
                i23 = i26;
            }
        }
        for (i29 = 11; i29 < 309; ++i29) {
            for (i31 = 1; i31 < 84; ++i31) {
                i25 += (((i31 * i25) + l4) - i30);
                l4 *= i24;
                for (i33 = 1; 2 > i33; ++i33) {
                    Test.dFld = i34;
                    Test.instanceCount = i28;
                    iArrFld = iArrFld;
                    Test.instanceCount += i26;
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}