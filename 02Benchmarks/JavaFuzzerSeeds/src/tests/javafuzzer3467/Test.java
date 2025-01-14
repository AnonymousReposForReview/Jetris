package tests.javafuzzer3467;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 08:49:42 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-5206703354351491012L;
    public volatile int iFld=53839;
    public static int iFld1=-1391;
    public static volatile double dFld=-1.5984;
    public static float fFld=0.260F;
    public static byte byFld=124;
    public static long lArrFld[]=new long[N];
    public float fArrFld[]=new float[N];
    public byte byArrFld[]=new byte[N];
    public short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 3171625455L);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(float f, int i2) {

        int i4=20470, i5=-200, i6=-14152, i7=-106, i8=-161, i9=-7, i10=8, iArr1[]=new int[N];
        short s=-13487;
        byte by=45;
        double d=-1.115522;
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr1, -22);
        FuzzerUtils.init(fArr, 1.261F);

        for (int i3 : iArr1) {
            for (i4 = 1; i4 < 4; i4++) {
                switch (((i5 >>> 1) % 10) + 107) {
                case 107:
                    for (i6 = 2; i6 > i4; --i6) {
                        s <<= (short)i3;
                    }
                    i2 += (-24582 + (i4 * i4));
                    for (i8 = 1; i8 < 2; ++i8) {
                        switch ((i4 % 10) + 76) {
                        case 76:
                            i10 <<= 160;
                            i9 = (int)4521301070215615665L;
                            break;
                        case 77:
                            Test.iFld1 -= 45439;
                            Test.instanceCount = i8;
                            i5 *= i2;
                            i9 -= (int)Test.dFld;
                            break;
                        case 78:
                            i9 = (int)Test.instanceCount;
                            break;
                        case 79:
                            Test.lArrFld[i8 + 1] ^= -23;
                            break;
                        case 80:
                            try {
                                iArr1[i8 + 1] = (-60738 % i7);
                                i10 = (i10 / 202);
                                i2 = (1993406616 / i5);
                            } catch (ArithmeticException a_e) {}
                        case 81:
                            iArr1[i4 - 1] += i2;
                            break;
                        case 82:
                            Test.instanceCount >>= -3584717396L;
                            break;
                        case 83:
                            by -= (byte)i10;
                            break;
                        case 84:
                            i7 += (((i8 * f) + i9) - Test.instanceCount);
                            break;
                        case 85:
                            iArr1[i8 + 1] = -2;
                            break;
                        default:
                            Test.dFld = i5;
                        }
                    }
                    break;
                case 108:
                    i2 <<= i7;
                    break;
                case 109:
                    i5 += (i4 | Test.iFld1);
                case 110:
                    fArr[i4 + 1] = i7;
                    break;
                case 111:
                    d += i4;
                    break;
                case 112:
                    f += Test.instanceCount;
                case 113:
                    i5 += (i4 + Test.instanceCount);
                    break;
                case 114:
                    Test.instanceCount *= i9;
                    break;
                case 115:
                    iArr1[i4] = (int)-45044L;
                    break;
                case 116:
                    i9 = i4;
                    break;
                }
            }
        }
        vMeth1_check_sum += Float.floatToIntBits(f) + i2 + i4 + i5 + i6 + i7 + s + i8 + i9 + i10 + by +
            Double.doubleToLongBits(d) + FuzzerUtils.checkSum(iArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth(int i1, long l, long l1) {

        int i11=203, i12=200, iArr2[]=new int[N];

        FuzzerUtils.init(iArr2, -5670);

        vMeth1(Test.fFld, Test.iFld1);
        i1 >>= Test.iFld1;
        i1 += -9;
        iArr2[(Test.iFld1 >>> 1) % N] <<= (int)l1;
        for (i11 = 8; 313 > i11; i11++) {
            i1 = Test.byFld;
            Test.fFld = i11;
        }
        Test.iFld1 = i12;
        vMeth_check_sum += i1 + l + l1 + i11 + i12 + FuzzerUtils.checkSum(iArr2);
    }

    public static long lMeth(int i) {

        long l2=-36967947534895052L;
        short s1=-3161;
        int i13=251, i14=3, i15=-12, i16=-234, iArr3[]=new int[N];
        boolean b=true;

        FuzzerUtils.init(iArr3, 3);

        vMeth(40387, Test.instanceCount, l2);
        Test.instanceCount = i;
        s1 = (short)Test.iFld1;
        i13 = 342;
        while ((i13 -= 2) > 0) {
            i = i13;
        }
        i14 = 1;
        while (++i14 < 166) {
            Test.byFld = (byte)i13;
            for (i15 = 1; 10 > i15; ++i15) {
                iArr3[i14 - 1] -= s1;
                Test.iFld1 = Test.iFld1;
                try {
                    iArr3[i14 + 1] = (52608 / i);
                    i16 = (-2282 / i15);
                    i16 = (32747 / i);
                } catch (ArithmeticException a_e) {}
                i = (int)Test.instanceCount;
                Test.iFld1 += (int)Test.instanceCount;
                i16 = i14;
                if (b) break;
            }
        }
        long meth_res = i + l2 + s1 + i13 + i14 + i15 + i16 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr3);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i17=170, i18=-4, i19=-9, i20=194, i21=4226, i22=-178, iArr[]=new int[N];
        double d1=121.109655;
        short s2=13315;
        boolean b1=false;

        FuzzerUtils.init(iArr, 1);

        iFld = (++iFld);
        Test.instanceCount -= iArr[(iFld >>> 1) % N];
        lMeth(iFld);
        for (i17 = 4; i17 < 216; ++i17) {
            for (d1 = 4; d1 < 118; d1++) {
                for (i20 = 1; i20 < 2; i20++) {
                    switch (((i17 % 10) * 5) + 94) {
                    case 101:
                        fArrFld[(int)(d1)] *= Test.instanceCount;
                        s2 += (short)(i20 * i20);
                        i22 = Test.byFld;
                        Test.iFld1 *= i18;
                        break;
                    case 122:
                        b1 = b1;
                        b1 = b1;
                        i22 += (i20 | (long)Test.fFld);
                    case 121:
                        byArrFld[(int)(d1 - 1)] += (byte)-57816;
                        Test.iFld1 += (i20 + i17);
                        break;
                    case 140:
                        Test.dFld += Test.iFld1;
                        i21 &= i20;
                        break;
                    case 114:
                        i19 = i21;
                        break;
                    case 118:
                        switch (((i20 % 1) * 5) + 2) {
                        case 5:
                            Test.fFld = i21;
                            Test.iFld1 += (((i20 * Test.iFld1) + Test.instanceCount) - Test.iFld1);
                            break;
                        }
                        sArrFld[(int)(d1 - 1)] += (short)i21;
                        iFld >>= (int)Test.instanceCount;
                        break;
                    case 142:
                        Test.iFld1 = (int)1.72F;
                        Test.iFld1 += (int)Test.instanceCount;
                        switch (((i20 % 1) * 5) + 7) {
                        case 12:
                            Test.instanceCount -= 1L;
                            s2 >>= (short)Test.instanceCount;
                            i19 += i20;
                            break;
                        default:
                            iFld += (i20 + i18);
                        }
                    case 131:
                        iArr = iArr;
                        break;
                    case 132:
                        iArr[(int)(d1)] -= (int)Test.instanceCount;
                        break;
                    case 141:
                        Test.fFld = Test.iFld1;
                        break;
                    default:
                        byArrFld[(int)(d1 + 1)] *= (byte)Test.instanceCount;
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
