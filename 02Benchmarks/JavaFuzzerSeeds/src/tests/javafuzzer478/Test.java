package tests.javafuzzer478;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 04:32:39 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=0L;
    public static float fFld=0.350F;
    public static boolean bFld=true;
    public byte byFld=-11;
    public static volatile int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -10);
        FuzzerUtils.init(Test.lArrFld, 43L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i2, int i3) {

        int i4=-54, i5=-19979, i6=-7991, i7=11, i8=-83, i9=6, i10=6, i11=-8, iArr[]=new int[N];
        double d=-2.51980;
        short s=-5066;
        long l3=-2932293935L;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 0.136F);
        FuzzerUtils.init(iArr, 7689);

        for (i4 = 135; i4 > 2; i4 -= 2) {
            d -= 65432;
            iArr[i4] = i4;
        }
        i5 >>= (int)Test.instanceCount;
        for (i6 = 6; i6 < 151; ++i6) {
            for (i8 = 11; i8 > 1; i8--) {
                i5 += s;
            }
            iArr[i6] += i5;
            switch (((i5 >>> 1) % 1) + 46) {
            case 46:
                i9 ^= i6;
                l3 = 1;
                do {
                    i2 <<= i8;
                    i10 = 1;
                    while ((i10 += 2) < 1) {
                        i5 -= i7;
                    }
                    i11 = -14;
                } while (++l3 < 11);
                break;
            }
        }
        vMeth2_check_sum += i2 + i3 + i4 + i5 + Double.doubleToLongBits(d) + i6 + i7 + i8 + i9 + s + l3 + i10 + i11 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(long l, long l1, long l2) {

        int i=10633, i1=5, i12=-3, i13=-192, i14=-9, i15=-13, i16=-25314;
        float f1=0.259F;
        short s1=-6286;
        byte by=78;
        boolean b=false;
        double d1=-1.83489, dArr[]=new double[N];

        FuzzerUtils.init(dArr, 86.9098);

        for (i = 13; i < 226; i++) {
            vMeth2(i1, i);
            for (f1 = 8; f1 > 1; f1 -= 3) {
                for (i13 = 4; i13 > 1; i13--) {
                    i1 = (int)l1;
                    s1 -= (short)l2;
                    Test.iArrFld[(int)(f1 - 1)] = by;
                    if (b) break;
                    Test.instanceCount += (long)d1;
                }
                for (i15 = 1; i15 < 4; i15++) {
                    float f2=0.144F;
                    dArr[(int)(f1 + 1)] %= (i | 1);
                    switch ((int)(((f1 % 10) * 5) + 48)) {
                    case 70:
                        f2 *= i14;
                        Test.iArrFld[i15 - 1] *= (int)d1;
                        l1 >>= i1;
                    case 77:
                        d1 -= i;
                        break;
                    case 79:
                        i16 *= (int)f1;
                        break;
                    case 92:
                        i16 = (int)Test.instanceCount;
                        break;
                    case 67:
                        i12 = i13;
                    case 78:
                        l2 <<= i;
                        break;
                    case 50:
                        i12 &= 2;
                        break;
                    case 75:
                        i1 = i;
                        break;
                    case 89:
                        l1 -= l2;
                    case 53:
                        Test.lArrFld[i - 1] *= i;
                        break;
                    }
                }
            }
        }
        vMeth1_check_sum += l + l1 + l2 + i + i1 + Float.floatToIntBits(f1) + i12 + i13 + i14 + s1 + by + (b ? 1 : 0) +
            Double.doubleToLongBits(d1) + i15 + i16 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth() {

        double d2=1.71713;
        int i17=-74, i18=-35645;
        float f3=34.355F;
        long l4=-2716L;
        short s2=-11467;

        vMeth1(Test.instanceCount, Test.instanceCount, Test.instanceCount);
        Test.iArrFld = FuzzerUtils.int1array(N, (int)-47276);
        for (d2 = 6; d2 < 133; ++d2) {
            i17 = i17;
        }
        f3 = -147L;
        i17 >>>= i17;
        i17 = i17;
        for (l4 = 16; l4 < 297; ++l4) {
            switch ((int)((l4 % 8) + 38)) {
            case 38:
                i18 = i17;
                i18 = (int)Test.instanceCount;
                i17 -= s2;
                Test.iArrFld[(int)(l4 + 1)] *= i17;
            case 39:
                i17 <<= i17;
                break;
            case 40:
            case 41:
                i18 /= (int)(i18 | 1);
            case 42:
                i18 += (int)-2535535515L;
                break;
            case 43:
                f3 = Test.instanceCount;
            case 44:
                i18 = (int)2.127677;
            case 45:
                s2 += (short)(l4 * l4);
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d2) + i17 + Float.floatToIntBits(f3) + l4 + i18 + s2;
    }

    public void mainTest(String[] strArr1) {

        long l5=-2021L, l6=-57291L;
        int i19=-72, i20=-4692, i21=3, i22=-65316;
        float f5=0.407F;
        double d3=2.39235;

        vMeth();
        for (l5 = 14; l5 < 359; l5++) {
            for (i20 = 73; i20 > l5; i20 -= 2) {
                l6 = 1;
                do {
                    float f4=0.939F;
                    i19 += (int)(((l6 * i20) + i20) - i19);
                    f4 += (l6 * i20);
                } while (++l6 < 1);
                switch ((int)((l5 % 4) + 84)) {
                case 84:
                    for (f5 = 1; f5 < 1; f5++) {
                        Test.lArrFld[i20 + 1] *= i22;
                        i22 *= i21;
                        Test.fFld = i21;
                        i19 -= (int)f5;
                        switch ((int)((f5 % 3) + 47)) {
                        case 47:
                            Test.fFld = i22;
                            i19 = (int)d3;
                        case 48:
                            Test.fFld *= i21;
                            try {
                                i21 = (i22 % i19);
                                i22 = (i22 % 87);
                                i22 = (Test.iArrFld[(int)(f5 - 1)] / i19);
                            } catch (ArithmeticException a_e) {}
                            i21 += (int)f5;
                            i21 += (int)Test.fFld;
                            break;
                        case 49:
                            Test.fFld = -10;
                            i19 *= -8;
                            break;
                        }
                        i21 += (int)f5;
                        switch ((int)((f5 % 9) + 122)) {
                        case 122:
                            i19 += i20;
                            Test.instanceCount += (long)f5;
                            break;
                        case 123:
                            i22 = i19;
                            i21 += (int)(f5 * f5);
                            Test.iArrFld[(int)(l5)] = (int)l5;
                            Test.fFld += (f5 - i21);
                            break;
                        case 124:
                            Test.iArrFld[i20 - 1] = i22;
                            break;
                        case 125:
                            if (Test.bFld) break;
                        case 126:
                            Test.iArrFld[(int)(l5)] |= byFld;
                            break;
                        case 127:
                            Test.fFld += (f5 * f5);
                        case 128:
                            i22 += 45;
                            break;
                        case 129:
                            i22 = (int)Test.instanceCount;
                            break;
                        case 130:
                            Test.instanceCount = i19;
                            break;
                        default:
                            Test.instanceCount -= -42578;
                        }
                    }
                    break;
                case 85:
                    i21 += (i20 * i20);
                    break;
                case 86:
                    i22 = (int)-4000007071L;
                    break;
                case 87:
                    Test.iArrFld[i20 + 1] = 122;
                    break;
                default:
                    if (Test.bFld) break;
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
