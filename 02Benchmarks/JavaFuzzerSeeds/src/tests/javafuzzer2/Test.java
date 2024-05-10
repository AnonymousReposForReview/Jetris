package tests.javafuzzer2;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 20:59:30 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-11L;
    public static float fFld=-59.999F;
    public static byte byFld=45;
    public static short sFld=1657;
    public static double dFld=0.79305;
    public static int iFld=-35;
    public static int iFld1=3;
    public static long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 54247L);
        FuzzerUtils.init(Test.iArrFld, 96);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long sMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static void vSmallMeth() {

        int i1=-29950;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 2.408F);

        i1 = (int)(fArr[(i1 >>> 1) % N] * (--i1));
        vSmallMeth_check_sum += i1 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static int iMeth(byte by, long l) {

        int i6=64011, i7=1, i8=19207, i9=-169, iArr1[]=new int[N];
        boolean b=false;
        long l1=797764326383231646L;

        FuzzerUtils.init(iArr1, 50295);

        i6 += (int)Test.instanceCount;
        i7 = 206;
        while (--i7 > 0) {
            for (i8 = 1; i8 < 8; i8++) {
                switch (((i8 % 2) * 5) + 3) {
                case 8:
                    i9 >>= (int)Test.instanceCount;
                    switch (((i8 % 3) * 5) + 113) {
                    case 122:
                        iArr1[i7 + 1] += (int)Test.fFld;
                        i9 %= (int)(i8 | 1);
                        i6 += i8;
                        b = false;
                        break;
                    case 121:
                        i9 = by;
                        break;
                    case 123:
                    }
                    l += (((i8 * i9) + i9) - i6);
                    break;
                case 12:
                    iArr1 = iArr1;
                    i9 *= (int)l1;
                    if (b) break;
                    break;
                default:
                    i9 = 6;
                }
            }
        }
        long meth_res = by + l + i6 + i7 + i8 + i9 + (b ? 1 : 0) + l1 + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth(int i5) {

        int i10=8, i11=-55715, i12=47687, i13=113, iArr2[]=new int[N];
        boolean b1=true;
        short sArr[]=new short[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(sArr, (short)-13791);
        FuzzerUtils.init(iArr2, -101);
        FuzzerUtils.init(lArr, 65039L);

        i5 *= (Math.min(i5, i5) + (iMeth(Test.byFld, -15925L) + i5));
        Test.instanceCount -= 65247;
        i5 = i5;
        i5 = (int)31.26925;
        for (i10 = 181; i10 > 3; --i10) {
            switch ((((-115 >>> 1) % 5) * 5) + 119) {
            case 139:
                i5 *= i11;
                break;
            case 137:
                Test.instanceCount >>>= i5;
                i11 += (i10 * i10);
                i11 &= Test.sFld;
                break;
            case 131:
                for (i12 = 1; i12 < 9; ++i12) {
                    switch ((i12 % 10) + 40) {
                    case 40:
                        i13 >>= i11;
                        Test.instanceCount += i10;
                    case 41:
                        i13 *= (int)Test.fFld;
                        break;
                    case 42:
                        Test.dFld = -52.294F;
                        break;
                    case 43:
                        Test.iFld += (-11576 + (i12 * i12));
                    case 44:
                        sArr[i10] = (short)Test.instanceCount;
                        break;
                    case 45:
                        if (b1) continue;
                    case 46:
                        Test.iFld >>= i12;
                        break;
                    case 47:
                        if (b1) break;
                        break;
                    case 48:
                        i13 = Test.iFld;
                        break;
                    case 49:
                        iArr2[i10 - 1] ^= (int)Test.instanceCount;
                        break;
                    }
                }
            case 135:
                Test.sFld += (short)i10;
                break;
            case 120:
                i13 >>= (int)2435557937L;
                break;
            default:
                lArr = lArr;
            }
        }
        long meth_res = i5 + i10 + i11 + i12 + i13 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(sArr) +
            FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(lArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public short sMeth() {

        int i14=-29018, i15=24, i16=65, i17=-22, i18=-7;
        float f=0.744F;
        boolean b2=true;

        Test.instanceCount += (long)((-42.60725 - lMeth(Test.iFld)) + Test.iFld);
        Test.instanceCount = Test.iFld;
        Test.iFld += 11;
        for (i14 = 13; i14 < 252; i14++) {
            Test.lArrFld[i14 - 1] <<= i15;
            Test.fFld -= Test.iFld;
            Test.fFld = i14;
            for (i16 = 1; i16 < 7; i16++) {
                for (f = 2; 1 < f; f--) {
                    Test.fFld = Test.byFld;
                    Test.iFld = Test.byFld;
                    Test.lArrFld[i14] = i14;
                }
                if (b2) break;
                Test.iArrFld[i14 + 1] *= 51144;
                Test.iFld = i15;
            }
        }
        long meth_res = i14 + i15 + i16 + i17 + Float.floatToIntBits(f) + i18 + (b2 ? 1 : 0);
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=164, i2=32, i3=-57310, i4=-7848, i19=8, i20=4499, i21=124, i22=-17876, iArr[]=new int[N];
        boolean b3=true, bArr[]=new boolean[N];

        FuzzerUtils.init(iArr, -13);
        FuzzerUtils.init(bArr, false);

        i = (iArr[(2 >>> 1) % N] - (i--));
        for (int smallinvoc=0; smallinvoc<761; smallinvoc++) vSmallMeth();
        i2 = 1;
        do {
            for (i3 = i2; i3 < 92; i3++) {
                Test.fFld = Integer.reverseBytes(-i3);
                i = sMeth();
                i <<= (int)Test.instanceCount;
                Test.iFld += (((i3 * Test.iFld) + Test.iFld) - i2);
                if (b3) break;
                Test.fFld += (((i3 * i4) + Test.fFld) - Test.iFld);
            }
            i -= Test.iFld;
            for (i19 = 3; i19 < 92; ++i19) {
                for (i21 = i19; i21 < 2; i21++) {
                    int i23=-120;
                    b3 = b3;
                    Test.iFld >>= 15;
                    switch (((i2 % 7) * 5) + 53) {
                    case 71:
                        i23 *= i2;
                        i23 += i21;
                        Test.instanceCount = i;
                        break;
                    case 54:
                        Test.dFld -= Test.fFld;
                        break;
                    case 60:
                        i += (i21 * i21);
                        Test.fFld += Test.fFld;
                        bArr[i2 - 1] = b3;
                        break;
                    case 79:
                        i4 <<= Test.iFld;
                        Test.iFld1 = Test.iFld1;
                        break;
                    case 63:
                        Test.fFld += (i21 + Test.instanceCount);
                        switch ((i2 % 2) + 77) {
                        case 77:
                            b3 = b3;
                            Test.iFld1 += (((i21 * i23) + i3) - i3);
                        case 78:
                            try {
                                i22 = (i21 % 29213);
                                Test.iFld = (-132 % i3);
                                i23 = (i22 % -206);
                            } catch (ArithmeticException a_e) {}
                            break;
                        }
                        break;
                    case 70:
                        Test.iArrFld[i2 - 1] += (int)7L;
                    case 73:
                        Test.fFld += (((i21 * Test.byFld) + i3) - Test.fFld);
                        break;
                    }
                }
            }
        } while (++i2 < 273);


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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  sMeth ->  sMeth mainTest
//DEBUG  lMeth ->  lMeth sMeth mainTest
//DEBUG  iMeth ->  iMeth lMeth sMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}